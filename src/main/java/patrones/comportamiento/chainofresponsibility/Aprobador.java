package patrones.comportamiento.chainofresponsibility;

public abstract class Aprobador {

    protected Aprobador siguiente;

    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void aprobar(double monto);
}