public class App {
    public static void main(String[] args) throws Exception {
        Arreglos arreglo = new Arreglos();
        System.out.println("Arreglo de 10");
        arreglo.generarArreglo10();
        System.out.println("Arreglo de 100");
        int[] arreglo10 = arreglo.generarArreglo10();
        arreglo.generarArreglo100(arreglo10);
    }
}
