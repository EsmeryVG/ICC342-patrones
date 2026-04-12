package patrones.comportamiento.command;

class EncenderVentiladorCommand implements Comando {

    private Ventilador ventilador;

    public EncenderVentiladorCommand(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void ejecutar() {
        ventilador.encender();
    }
}
