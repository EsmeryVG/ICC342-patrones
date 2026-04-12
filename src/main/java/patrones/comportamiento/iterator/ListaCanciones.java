package patrones.comportamiento.iterator;
import java.util.ArrayList;
import java.util.List;

// Colección concreta:
// Almacena las canciones y crea el iterador correspondiente
class ListaCanciones implements ColeccionCanciones {
    private List<String> canciones;

    public ListaCanciones() {
        canciones = new ArrayList<>();
    }

    public void agregarCancion(String cancion) {
        canciones.add(cancion);
    }

    public List<String> getCanciones() {
        return canciones;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorCanciones(canciones);
    }
}