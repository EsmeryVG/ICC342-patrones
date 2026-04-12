package patrones.comportamiento.iterator;

// Interfaz Iterator:
// Define las operaciones básicas para recorrer una colección
interface Iterador {
    boolean tieneSiguiente();
    String siguiente();
}