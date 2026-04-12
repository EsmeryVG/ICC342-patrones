package patrones.comportamiento.iterator;

import java.util.List;


// Iterador concreto:
// Implementa la lógica para recorrer la lista de canciones
class IteradorCanciones implements Iterador {
    private List<String> canciones;
    private int posicion = 0;

    public IteradorCanciones(List<String> canciones) {
        this.canciones = canciones;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < canciones.size();
    }

    @Override
    public String siguiente() {
        if (tieneSiguiente()) {
            String cancion = canciones.get(posicion);
            posicion++;
            return cancion;
        }
        return null;
    }
}