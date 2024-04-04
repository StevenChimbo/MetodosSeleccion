public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Metodos metodosClase =new Metodos();
        int [] numeros= {10,14,31,1313,3,3};
        int[] ordenadoSeleccion;

        metodosClase.imprimir(numeros);

        ordenadoSeleccion = metodosClase.MetodoSeleccion(numeros);
        metodosClase.imprimir(ordenadoSeleccion);

        // int{} ordenado = metodosClase.metodoSeleccion(numeros);
        // llamar al metodo para imprimir y le mandamos el arreglos ordenado

    }
}
