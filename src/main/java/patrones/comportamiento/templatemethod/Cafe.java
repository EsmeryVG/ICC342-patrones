package patrones.comportamiento.templatemethod;

public class Cafe extends Bebida {

    @Override
    protected void prepararBebida() {
        System.out.println("Preparando café...");
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Agregando azúcar y leche...");
    }
}