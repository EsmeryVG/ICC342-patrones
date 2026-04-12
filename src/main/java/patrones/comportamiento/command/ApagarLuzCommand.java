package patrones.comportamiento.command;

class ApagarLuzCommand implements Comando {

    private Luz luz;

    public ApagarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.apagar();
    }
}