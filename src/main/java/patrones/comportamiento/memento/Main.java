package patrones.comportamiento.memento;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        Historial historial = new Historial();

        editor.escribir("Hola ");
        historial.guardar(editor.guardar());

        editor.escribir("mundo ");
        historial.guardar(editor.guardar());

        editor.escribir("!!!");

        System.out.println("Actual: " + editor.getContenido());

        // Undo
        editor.restaurar(historial.deshacer());
        System.out.println("Undo 1: " + editor.getContenido());

        editor.restaurar(historial.deshacer());
        System.out.println("Undo 2: " + editor.getContenido()); }
}

