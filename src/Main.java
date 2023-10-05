public class Main {
    public static void main(String[] args) {
        Procesador procesador = new Procesador();
        procesador.marca = "AMD";
        procesador.modelo = "AM456";
        procesador.precio = 34.1;

        System.out.println(procesador.getNombreCompleto());
    }
}