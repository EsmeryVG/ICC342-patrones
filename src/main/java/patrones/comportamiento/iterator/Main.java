package patrones.comportamiento.iterator;

public class Main {
    public static void main(String[] args) {

        // Se crea la colección de canciones
        ListaCanciones lista = new ListaCanciones();
        lista.agregarCancion("Body to Body");
        lista.agregarCancion("One More Night");
        lista.agregarCancion("Normal");

        // Se obtiene un iterador para recorrer la colección
        Iterador iterador = lista.crearIterador();

        // Se recorren los elementos sin acceder directamente a la estructura interna
        while (iterador.tieneSiguiente()) {
            System.out.println("Cancion: " + iterador.siguiente());
        }
    }
}