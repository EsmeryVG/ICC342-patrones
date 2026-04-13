package patrones.comportamiento.chainofresponsibility;

public class Empleado extends Aprobador {

    @Override
    public void aprobar(double monto) {
        if (monto <= 100) {
            System.out.println("Empleado aprobó: $" + monto);
        } else if (siguiente != null) {
            siguiente.aprobar(monto);
        }
    }
}