package patrones.creacionales.abstractfactory;

import java.awt.*;

public class MacF implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Window createWindow() {
        return new MacWindow();
    }
}
