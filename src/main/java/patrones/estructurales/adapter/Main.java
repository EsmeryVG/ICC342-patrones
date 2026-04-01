package patrones.estructurales.adapter;

// Clase principal para ejecutar el programa
public class Main {

    public static void main(String[] args) {

        ReproductorExterno externo = new ReproductorExterno();

        // Usamos el Adapter
        Reproductor reproductor = new ReproductorAdapter(externo);

        // El cliente no sabe que hay adaptación
        reproductor.reproducir();
    }
}
