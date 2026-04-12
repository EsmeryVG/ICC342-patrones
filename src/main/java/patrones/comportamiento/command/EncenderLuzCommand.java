package patrones.comportamiento.command;

// Comando concreto:
// Encapsula la acción de encender la luz
class EncenderLuzCommand implements Comando {

    private Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }
}
