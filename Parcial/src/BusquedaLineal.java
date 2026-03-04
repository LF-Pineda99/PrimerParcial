import java.util.Arrays;

public class BusquedaLineal {

    public static int busquedaLinealIterativa(int[] arreglo, int numeroAEncontrar){
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == numeroAEncontrar){
                return i + 1;
            }
        }
        return -1;
    }

    public static int busquedaLinealRecursiva(int[] arreglo, int objetivo, int indice) {
        if (indice >= arreglo.length)
            return -1;
        else if (arreglo[indice] == objetivo)
            return indice + 1;

        return busquedaLinealRecursiva(arreglo, objetivo, indice - 1); // Siguiente índice
    }

    public static void main(String[] args) {
        // Arreglo a probar en algoritmo de Busqueda lineal
        int [] arreglo = {1000,500,100,5000,10000};

        /*
        int intentos = 1;
        int numeroSeleccionado = 10000;

        // Medicion de tiempo para el metodo Busqueda lineal Iterativo
        long sumaIterativo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            busquedaLinealIterativa(arreglo,numeroSeleccionado);
            long fin = System.nanoTime();
            sumaIterativo += (fin - inicio);
        }
        long promedioIterativo = sumaIterativo / intentos;

        // Medicion de tiempo para el metodo Busqueda lineal Recursivo
        long sumaRecursivo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            busquedaLinealRecursiva(arreglo,numeroSeleccionado,arreglo.length-1);
            long fin = System.nanoTime();
            sumaRecursivo += (fin - inicio);
        }
        long promedioRecursivo = sumaRecursivo / intentos;

        System.out.println("Arreglo seleccionado para obtener Busqueda lineal = " + Arrays.toString(arreglo));
        System.out.println("Tiempo promedio Iterativo: " + promedioIterativo + " nanosegundos");
        System.out.println("Tiempo promedio Recursivo: " + promedioRecursivo + " nanosegundos");
         */

        System.out.println(busquedaLinealIterativa(arreglo,100));
        System.out.println(busquedaLinealRecursiva(arreglo,100,arreglo.length-1));
    }
}
