import java.util.Random;
import java.util.Scanner;

public class Arreglos {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    Metodos metodos = new Metodos();

    //Variables

    public void printMessage(String message){
        System.out.println(message);
    }

    public void imprimirArreglo(int[] arreglo){
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public int[] generarArreglo10(){
        int[] arreglo10 = new int[10];
        for (int i = 0; i < 10; i++) {
            arreglo10[i] = rand.nextInt(30000) + 1; 
        }
        return arreglo10;
    }

    public int[] generarArreglo100(int[] arreglo10){
        int[] arreglo100 = new int[100];
        System.arraycopy(arreglo10, 0, arreglo100, 0, 10);
        for (int i = 10; i < 100; i++) {
            arreglo100[i] = rand.nextInt(30000) + 1;
        }
        return arreglo100;
    }

    public int[] generarArreglo1000(int[] arreglo100){
        int[] arreglo1000 = new int[1000];
        System.arraycopy(arreglo100, 0, arreglo1000, 0, 100);
        for (int i = 100; i < 1000; i++) {
            arreglo1000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo1000;
    }

    public int[] generarArreglo5000(int[] arreglo1000){
        int[] arreglo5000 = new int[5000];
        System.arraycopy(arreglo1000, 0, arreglo5000, 0, 1000);
        for (int i = 1000; i < 5000; i++) {
            arreglo5000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo5000;
    }

    public int[] generarArreglo10000(int[] arreglo5000){
        int[] arreglo10000 = new int[10000];
        System.arraycopy(arreglo5000, 0, arreglo10000, 0, 5000);
        for (int i = 5000; i < 10000; i++) {
            arreglo10000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo10000;
    }

    public int[] generarArreglo30000(int[] arreglo10000){
        int[] arreglo30000 = new int[30000];
        System.arraycopy(arreglo10000, 0, arreglo30000, 0, 10000);
        for (int i = 10000; i < 30000; i++) {
            arreglo30000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo30000;
    }
    

    int[] arreglo10 = new int[10];
    int[] arreglo100 = new int[100];
    int[] arreglo1000 = new int[1000];
    int[] arreglo5000 = new int[5000];
    int[] arreglo10000 = new int[10000];
    int[] arreglo30000 = new int[30000];

    public void menuPrincipal(){
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Generar Arreglos aleatorios con diferente tamaño");
            System.out.println("2. Ordenar por los 3 métodos y mostrar tiempos de ejecución");
            System.out.println("3. Buscar valores usando búsqueda binaria normal y recursiva");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    printMessage("Arreglo de 10");
                    arreglo10 = generarArreglo10();
                    //imprimirArreglo(arreglo10);
            
                    printMessage("Arreglo de 100");
                    arreglo100 = generarArreglo100(arreglo10);
                    //imprimirArreglo(arreglo100);
            
                    printMessage("Arreglo de 1000");
                    arreglo1000 = generarArreglo1000(arreglo100);
                    //imprimirArreglo(arreglo1000);
            
                    printMessage("Arreglo de 5000");
                    arreglo5000 = generarArreglo5000(arreglo1000);
                    //imprimirArreglo(arreglo5000);
            
                    printMessage("Arreglo de 10000");
                    arreglo10000 = generarArreglo10000(arreglo5000);
                    //imprimirArreglo(arreglo10000);
            
                    printMessage("Arreglo de 30000");
                    arreglo30000 = generarArreglo30000(arreglo10000);
                    //arreglo.imprimirArreglo(arreglo30000);

                    System.out.println("Arreglos generados.");
                    break;

                case 2:
                //BurbujaAvanzada
                    printMessage("");//Espacio entre la impresion de cada metodo
                    printMessage("Método Burbuja con Ajustes");
                    metodos.sortBumbbleAva(arreglo10);
                    metodos.sortBumbbleAva(arreglo100);
                    metodos.sortBumbbleAva(arreglo1000);
                    metodos.sortBumbbleAva(arreglo5000);
                    metodos.sortBumbbleAva(arreglo10000);
                    metodos.sortBumbbleAva(arreglo30000);
                    printMessage("");
                    printMessage("Método Selección");
                    metodos.seleccion(arreglo10);
                    metodos.seleccion(arreglo100);
                    metodos.seleccion(arreglo1000);
                    metodos.seleccion(arreglo5000);
                    metodos.seleccion(arreglo10000);
                    metodos.seleccion(arreglo30000);
                    printMessage("");
                    printMessage("Método Inserción");
                    metodos.insercion(arreglo10);
                    imprimirArreglo(arreglo10);
                    metodos.insercion(arreglo100);
                    imprimirArreglo(arreglo100);
                    metodos.insercion(arreglo1000);
                    metodos.insercion(arreglo5000);
                    metodos.insercion(arreglo10000);
                    metodos.insercion(arreglo30000);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a buscar (entre 1 y 30000): ");
                    int valor = scanner.nextInt();
                    metodos.busquedaBinaria(arreglo10, valor);
                    metodos.busquedaBinaria(arreglo100, valor);
                    metodos.busquedaBinaria(arreglo1000, valor);
                    metodos.busquedaBinaria(arreglo5000, valor);
                    metodos.busquedaBinaria(arreglo10000, valor);
                    metodos.busquedaBinaria(arreglo30000, valor);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }        
    }


}
