public class Metodos {
    public int busquedaBinaria(int[] arreglo, int value) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int cont = 1; // Contador de iteraciones
        long startTime = System.nanoTime(); // Tiempo de inicio
    
        while (inicio <= fin) {
            
            int medio = inicio + (fin - inicio) / 2;
    
            if (arreglo[medio] == value) {
                long endTime = System.nanoTime(); // Tiempo de finalización
                System.out.println("Número de iteraciones: " + cont);
                System.out.println("Tiempo de ejecución (ns): " + (endTime - startTime));
                return medio;
            }
    
            if (arreglo[medio] < value) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
            cont++; // Incrementa el contador en cada iteración
        }
    
        long endTime = System.nanoTime(); // Tiempo de finalización
        System.out.println("Número de iteraciones: " + cont);
        System.out.println("Tiempo de ejecución (ns): " + (endTime - startTime));
        return -1; // Valor no encontrado
    }
    
    public int busquedaSecuencia(int[] arreglo, int valorBuscar){
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == valorBuscar){
                return i;
            }

        }
        return -1;
    }
    public  void printArreglo(int[] arreglo) {
        for (int elem: arreglo){
            System.out.print(elem + " ");    
        }
    }

    
}
