package patrones.comportamiento.chainofresponsibility;

public class Gerente extends Aprobador {

    @Override
    public void aprobar(double monto) {
        if (monto <= 1000) {
            System.out.println("Gerente aprobó: $" + monto);
        } else if (siguiente != null) {
            siguiente.aprobar(monto);
        }
    }
}