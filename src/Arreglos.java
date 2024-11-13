import java.util.Random;

public class Arreglos {
    Random rand = new Random();

    public int[] generarArreglo10(){
        int tamaño = 10; // Número de elementos en el arreglo
        int[] arreglo10 = new int[tamaño];

        // Llenar el arreglo con números aleatorios entre 1 y 100
        for (int i = 0; i < tamaño; i++) {
            arreglo10[i] = rand.nextInt(30000) + 1; // Genera un número entre 1 y 30000
        }

        // Imprimir el arreglo
        for (int num : arreglo10) {
            System.out.print(num + " ");
        }

        return arreglo10;
    }

    public int[] generarArreglo100(int[] arreglo10){
        int[] arreglo100 = new int[100];

        // Copiar los primeros 10 números del arreglo original
        System.arraycopy(arreglo10, 0, arreglo100, 0, 10);

        // Llenar los siguientes 90 elementos con números aleatorios entre 1 y 30000
        for (int i = 10; i < 100; i++) {
            arreglo100[i] = rand.nextInt(30000) + 1;
        }

        // Imprimir el arreglo
        for (int num : arreglo100) {
            System.out.print(num + " ");
        }
        return arreglo100;
    }



}
