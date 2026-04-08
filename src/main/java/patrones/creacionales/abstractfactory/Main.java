package patrones.creacionales.abstractfactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory = new WindowsF(); // o MacF

        Button b = factory.createButton();
        Window w = factory.createWindow();

        b.render();
        w.open();
    }
}