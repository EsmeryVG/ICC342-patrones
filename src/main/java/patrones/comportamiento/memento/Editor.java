package patrones.comportamiento.memento;

public class Editor {

    private String contenido;

    public void escribir(String texto) {
        contenido += texto;
    }

    public String getContenido() {
        return contenido;
    }

    // Guardar estado
    public Memento guardar() {
        return new Memento(contenido);
    }

    // Restaurar estado
    public void restaurar(Memento memento) {
        contenido = memento.getContenido();
    }
}