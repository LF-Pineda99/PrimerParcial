
public class Fibonacci {

    public static long fibonacciIterativa(int numeroLimite) {
        if (numeroLimite <= 1) return 1;

        long a = 0, b = 1, suma;
        for (int i = 2; i <= numeroLimite; i++) {
            suma = a + b;
            a = b;
            b = suma;
        }
        return b;
    }

    public static long fibonacciRecursivo(int numeroLimite) {
        if  (numeroLimite <= 1) return numeroLimite;
        return fibonacciRecursivo(numeroLimite - 1) + fibonacciRecursivo(numeroLimite - 2) ;
    }

    public static void main(String[] args) {
        /*
        // El número a probar en algoritmo de factorial
        int numeroSeleccionado = 30;
        int intentos = 1;

        // Medicion de tiempo para el metodo Fibonacci Iterativo
        long sumaIterativo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            fibonacciIterativa(numeroSeleccionado);
            long fin = System.nanoTime();
            sumaIterativo += (fin - inicio);
        }
        long promedioIterativo = sumaIterativo / intentos;

        // Medicion de tiempo para el metodo Fibonacci Recursivo
        long sumaRecursivo = 0;
        for (int i = 0; i < intentos; i++) {
            long inicio = System.nanoTime();
            fibonacciRecursivo(numeroSeleccionado);
            long fin = System.nanoTime();
            sumaRecursivo += (fin - inicio);
        }

        long promedioRecursivo = sumaRecursivo / intentos;


        System.out.println("Numero seleccionado para obtener Fibonacci = " + numeroSeleccionado);
        System.out.println("Tiempo promedio Iterativo: " + promedioIterativo + " nanosegundos");
        System.out.println("Tiempo promedio Recursivo: " + promedioRecursivo + " nanosegundos");*/

        System.out.println("Fibonacci: " + fibonacciRecursivo(4));
    }
}
