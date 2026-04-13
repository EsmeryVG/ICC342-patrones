package patrones.comportamiento.chainofresponsibility;

public class Director extends Aprobador {

    @Override
    public void aprobar(double monto) {
        System.out.println("Director aprobó: $" + monto);
    }
}