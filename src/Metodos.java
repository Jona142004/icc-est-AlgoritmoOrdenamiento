import java.util.Arrays;

public class Metodos {
    public int busquedaBinaria(int[] copiaArreglo, int value) {
        int inicio = 0;
        int fin = copiaArreglo.length - 1;
        int cont = 1; // Contador de iteraciones
        long startTime = System.nanoTime(); // Tiempo de inicio
    
        while (inicio <= fin) {
            
            int medio = inicio + (fin - inicio) / 2;
    
            if (copiaArreglo[medio] == value) {
                long endTime = System.nanoTime(); // Tiempo de finalización
                System.out.println("Número de iteraciones: " + cont);
                System.out.println("Tiempo de ejecución (ns): " + (endTime - startTime));
                return medio;
            }
    
            if (copiaArreglo[medio] < value) {
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
    
    public class MetodoOrdenamiento {
        public int[] sortBumbbleAva(int[] arreglo){
            int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
            int n = copiaArreglo.length;
            boolean intercambio = false;
            for(int i =0; i < n; i++){
                for(int j =0; j < n-1-i; j++){
                    if(copiaArreglo[j] > copiaArreglo[j+1]){
                    //  Intercambio
                    int aux = copiaArreglo[j];
                    copiaArreglo[j] = copiaArreglo[j+1];
                    copiaArreglo [j+1] = aux;
                    intercambio = true;
            }
        }
        //Si no hubo ningun intercambio deberia finalizar el codigo si ya esta ordenado
        if (!intercambio){
            break;
        }
        }
        return copiaArreglo;
    }
    public void seleccion(int[] arreglo) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);

        int n = copiaArreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (copiaArreglo[j] < copiaArreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = copiaArreglo[minIndex];
            copiaArreglo[minIndex] = copiaArreglo[i];
            copiaArreglo[i] = temp;
        }
    }
    public void insercion(int[] arreglo) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);

        int n = copiaArreglo.length;
        for (int i = 1; i < n; i++) {
            int key = copiaArreglo[i];
            int j = i - 1;
            while (j >= 0 && copiaArreglo[j] > key) {
                copiaArreglo[j + 1] = copiaArreglo[j];
                j = j - 1;
            }
            copiaArreglo[j + 1] = key;
        }
    }    
        public int busquedaBinariaRecursiva(int[] arreglo, int elemento, int inicio, int fin) {
            int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
            // Caso base: si el subarreglo no tiene elementos
            if (inicio > fin) {
                return -1; // Elemento no encontrado
            }
            int medio = inicio + (fin - inicio) / 2;
    
            // Si el elemento está en el medio
            if (copiaArreglo[medio] == elemento) {
                return medio;
            }
            // Si el elemento es menor que el valor en el medio, buscar en la mitad izquierda
            if (copiaArreglo[medio] > elemento) {
                return busquedaBinariaRecursiva(copiaArreglo, elemento, inicio, medio - 1);
            } else {
                // Si el elemento es mayor, buscar en la mitad derecha
                return busquedaBinariaRecursiva(copiaArreglo, elemento, medio + 1, fin);
            }
        }
        public void medirTiempoOrdenamiento(int[] arreglo, String metodo) {
            int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
            long inicio = System.nanoTime();
            switch (metodo) {
                case "Inserción":
                    insercion(copiaArreglo);
                    break;
                case "Selección":
                    seleccion(copiaArreglo);
                    break;
                case "Burbuja":
                    sortBumbbleAva(copiaArreglo);
                    break;
            }
            long fin = System.nanoTime();
            System.out.println("Tiempo de ordenamiento por " + metodo + ": " + (fin - inicio) + " nanosegundos");
        }
        public void medirTiempoBusqueda(int[] arreglo, int valor, String tipo) {
            long inicio = System.nanoTime();
            int resultado = (tipo.equals("normal")) ? busquedaBinaria(arreglo, valor) :
                    busquedaBinariaRecursiva(arreglo, valor, 0, arreglo.length - 1);
            long fin = System.nanoTime();
    
            if (resultado == -1) {
                System.out.println("Valor no encontrado en la búsqueda " + tipo + ".");
            } else {
                System.out.println("Valor encontrado en índice " + resultado + " en búsqueda " + tipo + ".");
            }
            System.out.println("Tiempo de búsqueda " + tipo + ": " + (fin - inicio) + " nanosegundos");
        }
        public void ordenarYMedirTiempo(int[] arreglo, String nombreArreglo) {
            System.out.println("\nOrdenando arreglo de " + nombreArreglo + ":");
            medirTiempoOrdenamiento(arreglo10, "Inserción");
            medirTiempoOrdenamiento(arreglo.clone(), "Selección");
            medirTiempoOrdenamiento(arreglo.clone(), "Burbuja");
        }
    
        
}
}
