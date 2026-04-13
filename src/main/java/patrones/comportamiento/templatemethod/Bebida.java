package patrones.comportamiento.templatemethod;

public abstract class Bebida {

    public final void preparar() {
        hervirAgua();
        prepararBebida();
        servir();
        agregarExtras();
    }

    private void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    private void servir() {
        System.out.println("Sirviendo en taza...");
    }

    // Métodos que las subclases deben definir
    protected abstract void prepararBebida();
    protected abstract void agregarExtras();
}