import java.util.Arrays;

public class Burbuja {

    public static int[] burbujaIterativo(int[] arreglo) {

        int marcaOptimizacion = arreglo.length - 1;

        while (marcaOptimizacion > 0) {
            int nuevaMarca = 0;

            for (int i = 0; i < marcaOptimizacion; i++) {
                int vIzquierda = arreglo[i];
                int vDerecha = arreglo[i + 1];

                if (vIzquierda > vDerecha) {
                    arreglo[i] = vDerecha;
                    arreglo[i + 1] = vIzquierda;
                    nuevaMarca = i;
                }
            }
            marcaOptimizacion = nuevaMarca;
        }
        return arreglo;
    }

    public static void burbujaRecursivo(int[] arreglo, int longitudArreglo){
        if  (longitudArreglo == 1) return ;

        for (int i = 0; i <= longitudArreglo - 1; i++){
            if (arreglo[i] > arreglo[i+1]){
                int temp = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = temp;
            }
        }
        burbujaRecursivo(arreglo,longitudArreglo -1);

    }

    public static void main(String[] args) {
        int [] arreglo = {1000,500,100,5000,10000};

        /*
        int intentos = 5;

        // Medicion de tiempo para el metodo Burbuja Iterativo
        long sumaIterativo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            burbujaIterativo(arreglo);
            long fin = System.nanoTime();
            sumaIterativo += (fin - inicio);
        }
        long promedioIterativo = sumaIterativo / intentos;

        // Medicion de tiempo para el metodo Burbuja Recursivo
        long sumaRecursivo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            burbujaRecursivo(arreglo,arreglo.length-1);
            long fin = System.nanoTime();
            sumaRecursivo += (fin - inicio);
        }
        long promedioRecursivo = sumaRecursivo / intentos;


        System.out.println("Arreglo seleccionado para obtener algoritmo Burbuja = " + Arrays.toString(arreglo));
        System.out.println("Tiempo promedio Iterativo: " + promedioIterativo + " nanosegundos");
        System.out.println("Tiempo promedio Recursivo: " + promedioRecursivo + " nanosegundos");*/

        System.out.println(Arrays.toString(burbujaIterativo(arreglo)));
    }
}

