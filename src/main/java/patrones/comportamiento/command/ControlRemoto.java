package patrones.comportamiento.command;

// Invoker:
// No sabe qué hace el comando, solo lo ejecuta
class ControlRemoto {

    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void presionarBoton() {
        comando.ejecutar();
    }
}