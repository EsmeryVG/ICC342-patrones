package patrones.creacionales.abstractfactory;


public class WindowsF implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Window createWindow() {
        return new WindowsWindow();
    }
}
