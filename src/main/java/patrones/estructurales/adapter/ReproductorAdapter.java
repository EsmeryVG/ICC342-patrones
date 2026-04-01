package patrones.estructurales.adapter;

// Adapter que traduce entre interfaces
public class ReproductorAdapter implements Reproductor {

    private ReproductorExterno reproductorExterno;

    public ReproductorAdapter(ReproductorExterno reproductorExterno) {
        this.reproductorExterno = reproductorExterno;
    }

    @Override
    public void reproducir() {
        // Traduce la llamada
        reproductorExterno.playMusic();
    }
}
