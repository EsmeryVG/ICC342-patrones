package patrones.comportamiento.templatemethod;

public class Te extends Bebida {

    @Override
    protected void prepararBebida() {
        System.out.println("Preparando té...");
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Agregando limón...");
    }
}