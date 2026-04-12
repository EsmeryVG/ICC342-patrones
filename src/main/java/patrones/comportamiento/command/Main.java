package patrones.comportamiento.command;

public class Main {
    public static void main(String[] args) {

        // Receivers
        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();

        // Comandos
        Comando encenderLuz = new EncenderLuzCommand(luz);
        Comando apagarLuz = new ApagarLuzCommand(luz);
        Comando encenderVentilador = new EncenderVentiladorCommand(ventilador);

        // Invoker
        ControlRemoto control = new ControlRemoto();

        // Ejecutar comandos
        control.setComando(encenderLuz);
        control.presionarBoton();

        control.setComando(apagarLuz);
        control.presionarBoton();

        control.setComando(encenderVentilador);
        control.presionarBoton();
    }
}