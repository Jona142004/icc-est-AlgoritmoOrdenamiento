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
    
   
    public  void printArreglo(int[] arreglo) {
        for (int elem: arreglo){
            System.out.print(elem + " ");    
        }
    }
    public class MetodoOrdenamiento {
        public int[] sortBumbbleAva(int[] arreglo){
            int n = arreglo.length;
            boolean intercambio = false;
    
            for(int i =0; i < n; i++){
                System.out.println("Pasada" +i );
    
                for(int j =0; j < n-1-i; j++){
                    System.out.println("j="+j+"[j]="+ arreglo[j]+"j+1="+j+1+"[j+1]="+arreglo[j+1]);
                    if(arreglo[j] > arreglo[j+1]){
                        System.out.println("Si hay cambio");
                    //  Intercambio
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo [j+1] = aux;
                    intercambio = true;
            }
        }
        //Si no hubo ningun intercambio deberia finalizar el codigo si ya esta ordenado
        if (!intercambio){
            break;
        }
        }
        return arreglo;
    }
    public void seleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
    }
    public void insercion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;
        }
    }    

    
}
}
