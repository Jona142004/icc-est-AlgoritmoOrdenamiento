import java.util.Random;

public class Arreglos {
    Random rand = new Random();

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
        int tamaño = 10; 
        int[] arreglo10 = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
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
        System.arraycopy(arreglo100, 0, arreglo1000, 0, 10);
        for (int i = 100; i < 1000; i++) {
            arreglo100[i] = rand.nextInt(30000) + 1;
        }
        return arreglo1000;
    }

    public int[] generarArreglo5000(int[] arreglo1000){
        int[] arreglo5000 = new int[5000];
        System.arraycopy(arreglo1000, 0, arreglo5000, 0, 10);
        for (int i = 1000; i < 5000; i++) {
            arreglo5000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo5000;
    }

    public int[] generarArreglo10000(int[] arreglo5000){
        int[] arreglo10000 = new int[10000];
        System.arraycopy(arreglo5000, 0, arreglo10000, 0, 10);
        for (int i = 5000; i < 10000; i++) {
            arreglo10000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo10000;
    }

    public int[] generarArreglo30000(int[] arreglo10000){
        int[] arreglo30000 = new int[30000];
        System.arraycopy(arreglo10000, 0, arreglo30000, 0, 10);
        for (int i = 10000; i < 30000; i++) {
            arreglo30000[i] = rand.nextInt(30000) + 1;
        }
        return arreglo30000;
    }



}
