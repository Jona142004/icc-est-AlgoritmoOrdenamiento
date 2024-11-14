import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Arreglos arreglo = new Arreglos();
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Generar Arreglos aleatorios con diferente tamaño");
            System.out.println("2. Ordenar por los 3 métodos y mostrar tiempos de ejecución");
            System.out.println("3. Buscar valores usando búsqueda binaria normal y recursiva");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                arreglo.printMessage("Arreglo de 10");
                int[] arreglo10 = arreglo.generarArreglo10();
                arreglo.imprimirArreglo(arreglo10);
        
                arreglo.printMessage("Arreglo de 100");
                int[] arreglo100 = arreglo.generarArreglo100(arreglo10);
                arreglo.imprimirArreglo(arreglo100);
        
                arreglo.printMessage("Arreglo de 1000");
                int[] arreglo1000 = arreglo.generarArreglo1000(arreglo100);
                arreglo.imprimirArreglo(arreglo1000);
        
                arreglo.printMessage("Arreglo de 5000");
                int[] arreglo5000 = arreglo.generarArreglo5000(arreglo1000);
                arreglo.imprimirArreglo(arreglo5000);
        
                arreglo.printMessage("Arreglo de 10000");
                int[] arreglo10000 = arreglo.generarArreglo10000(arreglo5000);
                //arreglo.imprimirArreglo(arreglo10000);
        
                arreglo.printMessage("Arreglo de 30000");
                int[] arreglo30000 = arreglo.generarArreglo30000(arreglo10000);
                //arreglo.imprimirArreglo(arreglo30000);

                    System.out.println("Arreglos generados.");
                    break;

                case 2:
                    

                case 3:
                    System.out.print("Ingrese el valor a buscar (entre 1 y 30000): ");
                    int valor = scanner.nextInt();
                    

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

