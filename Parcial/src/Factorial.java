public class Factorial {

    public static long factorialIterativo(int n) {
        long resultado = 1;
        if (n == 0 || n == 1) return resultado;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static long factorialRecursivo(int n) {
        if (n == 0 || n == 1) return 1;
        else {
            return factorialRecursivo(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        /*
        // El número a probar en algoritmo de factorial
        int numeroSeleccionado = 30;
        int intentos = 1;

        // Medicion de tiempo para el metodo Factorial Iterativo
        long sumaIterativo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            factorialIterativo(numeroSeleccionado);
            long fin = System.nanoTime();
            sumaIterativo += (fin - inicio);
        }
        long promedioIterativo = sumaIterativo / intentos;

        // Medicion de tiempo para el metodo Factorial Recursivo
        long sumaRecursivo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            factorialRecursivo(numeroSeleccionado);
            long fin = System.nanoTime();
            sumaRecursivo += (fin - inicio);
        }

        long promedioRecursivo = sumaRecursivo / intentos;


        System.out.println("Numero seleccionado para obtener factorial = " + numeroSeleccionado);
        System.out.println("Tiempo promedio Iterativo: " + promedioIterativo + " nanosegundos");
        System.out.println("Tiempo promedio Recursivo: " + promedioRecursivo + " nanosegundos"); */

        System.out.println(factorialIterativo(3));
    }
}