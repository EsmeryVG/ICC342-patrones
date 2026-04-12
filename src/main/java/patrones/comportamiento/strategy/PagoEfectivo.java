package patrones.comportamiento.strategy;

class PagoEfectivo implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " en efectivo");
    }
}
