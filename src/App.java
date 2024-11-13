public class App {
    public static void main(String[] args) throws Exception {
        Arreglos arreglo = new Arreglos();

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
        arreglo.imprimirArreglo(arreglo10000);

        arreglo.printMessage("Arreglo de 30000");
        int[] arreglo30000 = arreglo.generarArreglo30000(arreglo10000);
        arreglo.imprimirArreglo(arreglo30000);

    }
}
