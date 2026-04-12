package patrones.comportamiento.strategy;

public class Main {
    public static void main(String[] args) {

        ProcesadorPago procesador = new ProcesadorPago();

        // Usar tarjeta
        procesador.setMetodoPago(new PagoTarjeta());
        procesador.procesarPago(100.0);

        // Cambiar a PayPal
        procesador.setMetodoPago(new PagoPayPal());
        procesador.procesarPago(200.0);

        // Cambiar a efectivo
        procesador.setMetodoPago(new PagoEfectivo());
        procesador.procesarPago(50.0);
    }
}
