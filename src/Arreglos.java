import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arreglos {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    Metodos metodos = new Metodos();

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
            
                    printMessage("Arreglo de 100");
                    arreglo100 = generarArreglo100(arreglo10);
            
                    printMessage("Arreglo de 1000");
                    arreglo1000 = generarArreglo1000(arreglo100);
            
                    printMessage("Arreglo de 5000");
                    arreglo5000 = generarArreglo5000(arreglo1000);
            
                    printMessage("Arreglo de 10000");
                    arreglo10000 = generarArreglo10000(arreglo5000);
            
                    printMessage("Arreglo de 30000");
                    arreglo30000 = generarArreglo30000(arreglo10000);

                    System.out.println("Arreglos generados.");
                    break;

                case 2:
                    //BurbujaAvanzada
                    printMessage("");//Espacio entre la impresion de cada metodo
                    printMessage("Método Burbuja con Ajustes");
                    int[] copiaBurbuja10 = Arrays.copyOf(arreglo10, arreglo10.length);
                    metodos.sortBumbbleAva(copiaBurbuja10);

                    int[] copiaBurbuja100 = Arrays.copyOf(arreglo100, arreglo100.length);
                    metodos.sortBumbbleAva(copiaBurbuja100);

                    int[] copiaBurbuja1000 = Arrays.copyOf(arreglo1000, arreglo1000.length);
                    metodos.sortBumbbleAva(copiaBurbuja1000);

                    int[] copiaBurbuja5000 = Arrays.copyOf(arreglo5000, arreglo5000.length);
                    metodos.sortBumbbleAva(copiaBurbuja5000);

                    int[] copiaBurbuja10000 = Arrays.copyOf(arreglo10000, arreglo10000.length);
                    metodos.sortBumbbleAva(copiaBurbuja10000);

                    int[] copiaBurbuja30000 = Arrays.copyOf(arreglo30000, arreglo30000.length);
                    metodos.sortBumbbleAva(copiaBurbuja30000);

                    //SELECCION
                    printMessage("");
                    printMessage("Método Selección");
                    int[] copiaSeleccion10 = Arrays.copyOf(arreglo10, arreglo10.length);
                    metodos.seleccion(copiaSeleccion10);
                    
                    int[] copiaSeleccion100 = Arrays.copyOf(arreglo100, arreglo100.length);
                    metodos.seleccion(copiaSeleccion100);
                    
                    int[] copiaSeleccion1000 = Arrays.copyOf(arreglo1000, arreglo1000.length);
                    metodos.seleccion(copiaSeleccion1000);
                    
                    int[] copiaSeleccion5000 = Arrays.copyOf(arreglo5000, arreglo5000.length);
                    metodos.seleccion(copiaSeleccion5000);
                    
                    int[] copiaSeleccion10000 = Arrays.copyOf(arreglo10000, arreglo10000.length);
                    metodos.seleccion(copiaSeleccion10000);
                    
                    int[] copiaSeleccion30000 = Arrays.copyOf(arreglo30000, arreglo30000.length);
                    metodos.seleccion(copiaSeleccion30000);
                    
                    //INSERCION
                    printMessage("");
                    printMessage("Método Inserción");
                    int[] copiaInsercion10 = Arrays.copyOf(arreglo10, arreglo10.length);
                    arreglo10 = metodos.insercion(copiaInsercion10);
                    
                    int[] copiaInsercion100 = Arrays.copyOf(arreglo100, arreglo100.length);
                    arreglo100 = metodos.insercion(copiaInsercion100);
                    
                    int[] copiaInsercion1000 = Arrays.copyOf(arreglo1000, arreglo1000.length);
                    arreglo1000 = metodos.insercion(copiaInsercion1000);
                    
                    int[] copiaInsercion5000 = Arrays.copyOf(arreglo5000, arreglo5000.length);
                    arreglo5000 = metodos.insercion(copiaInsercion5000);
                    
                    int[] copiaInsercion10000 = Arrays.copyOf(arreglo10000, arreglo10000.length);
                    arreglo10000 = metodos.insercion(copiaInsercion10000);
                    
                    int[] copiaInsercion30000 = Arrays.copyOf(arreglo30000, arreglo30000.length);
                    arreglo30000 = metodos.insercion(copiaInsercion30000);                    
                    
                    break;
                case 3:
                    //BUSQUEDA BINARIA
                    System.out.print("Ingrese el valor a buscar (entre 1 y 30000): ");
                    int valor = scanner.nextInt();
                    metodos.busquedaBinaria(arreglo10, valor);
                    metodos.busquedaBinaria(arreglo100, valor);
                    metodos.busquedaBinaria(arreglo1000, valor);
                    metodos.busquedaBinaria(arreglo5000, valor);
                    metodos.busquedaBinaria(arreglo10000, valor);
                    metodos.busquedaBinaria(arreglo30000, valor);
                    //BUSQUEDA BINARIA RECURSIVA
                    metodos.busquedaBinariaRecursiva(arreglo10, valor, 0, 10);
                    metodos.busquedaBinariaRecursiva(arreglo100, valor, 0, 100);
                    metodos.busquedaBinariaRecursiva(arreglo1000, valor, 0, 1000);
                    metodos.busquedaBinariaRecursiva(arreglo5000, valor, 0, 5000);
                    metodos.busquedaBinariaRecursiva(arreglo10000, valor, 0, 10000);
                    metodos.busquedaBinariaRecursiva(arreglo30000, valor, 0, 30000);

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
