import java.util.Arrays;

public class Metodos {
     /******************************METODOS DE BUSQUEDA*********************************/
     public int busquedaBinaria(int[] copiaArreglo, int value) {
        int inicio = 0;
        int fin = copiaArreglo.length - 1;
        int cont = 1; 
        int n = copiaArreglo.length;
        long startTime = System.nanoTime(); // Inicio
    
        while (inicio <= fin) {
            
            int medio = inicio + (fin - inicio) / 2;
    
            if (copiaArreglo[medio] == value) {
                long endTime = System.nanoTime(); //Fin
                double executionTime = (endTime - startTime) / 1_000_000_000.0; //Conversion de ns a seg
                System.out.println("Número de iteraciones: " + cont);
                System.out.println("Con " + n + " valores el tiempo es de " + executionTime + " seg.");
                posicionEncontrada(medio);
                return medio;
            }
    
            if (copiaArreglo[medio] < value) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
            cont++; 
        }
    
        long endTime = System.nanoTime(); // Fin en caso de no encontrar el valor
        double executionTime = (endTime - startTime) / 1_000_000_000.0; //Conversion de ns a seg
        System.out.println("Número de iteraciones: " + cont);
        System.out.println("Con " + n + " valores el tiempo es de " + executionTime + " seg.");
        return -1; // Valor no encontrado
    }

    public void posicionEncontrada(int medio){
        if(medio != -1){
            System.out.println("La posicion del numero es " + medio);
        } else{
            System.out.println("El numero no fue encontrado");
        }
    }

    public int busquedaBinariaRecursiva(int[] arreglo, int elemento, int inicio, int fin) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
        int n = copiaArreglo.length;
        
        long startTime = System.nanoTime();
    
        int resultado = busquedaBinariaRecursivaAux(copiaArreglo, elemento, inicio, fin);
    
        long endTime = System.nanoTime();
    
        double totalTime = (endTime - startTime) / 1e9;
    
        System.out.println("Con " + n + " valores el tiempo es de " + totalTime + " seg.");
    
        return resultado;
    }
    
    private int busquedaBinariaRecursivaAux(int[] arreglo, int elemento, int inicio, int fin) {
        if (inicio > fin) {
            return -1;
        }
        int medio = inicio + (fin - inicio) / 2;
    
        if (arreglo[medio] == elemento) {
            return medio;
        }
        if (arreglo[medio] > elemento) {
            return busquedaBinariaRecursivaAux(arreglo, elemento, inicio, medio - 1);
        } else {
            return busquedaBinariaRecursivaAux(arreglo, elemento, medio + 1, fin);
        }
    }
    
    
    /******************************METODOS DE ORDENAMIENTO*********************************/

    public int[] sortBumbbleAva(int[] arreglo) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
        int n = copiaArreglo.length;
        boolean intercambio;
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            intercambio = false; 
    
            for (int j = 0; j < n - 1 - i; j++) {
                if (copiaArreglo[j] > copiaArreglo[j + 1]) {
                    int aux = copiaArreglo[j];
                    copiaArreglo[j] = copiaArreglo[j + 1];
                    copiaArreglo[j + 1] = aux;
                    intercambio = true; 
                }
            }
            if (!intercambio) {
                break;
            }
        }
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1_000_000_000.0; //Conversion de ns a seg
        System.out.println("Con " + n + " valores el tiempo es de " + executionTime + " seg.");
    
        return copiaArreglo; 
    }
    
    public int[] seleccion(int[] arreglo) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
        int n = copiaArreglo.length;
        long startTime = System.nanoTime(); //Inicio
    
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
        long endTime = System.nanoTime(); //Fin
        double totalTime = (endTime - startTime) / 1_000_000_000.0; //Conversion de ns a seg
        System.out.println("Con " + n + " valores el tiempo es de " + totalTime + " seg.");
        return copiaArreglo;
    }
    

    public int[] insercion(int[] arreglo) {
        // Crea una copia del arreglo original
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
        int n = copiaArreglo.length;
        long startTime = System.nanoTime();
        for (int i = 1; i < n; i++) {
            int key = copiaArreglo[i];
            int j = i - 1;
            while (j >= 0 && copiaArreglo[j] > key) {
                copiaArreglo[j + 1] = copiaArreglo[j];
                j = j - 1;
            }
            copiaArreglo[j + 1] = key;
        }
        long endTime = System.nanoTime();
        double totalTime = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Con " + n + " valores el tiempo es de " + totalTime + " seg.");
        return copiaArreglo;
    }

}
