package patrones.comportamiento.strategy;

// Clase Contexto:
// Usa una estrategia, pero no sabe cómo funciona internamente
class ProcesadorPago {

    private MetodoPago metodoPago;

    // Permite cambiar la estrategia en tiempo de ejecución
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(double monto) {
        if (metodoPago == null) {
            System.out.println("No se ha seleccionado un método de pago");
            return;
        }

        metodoPago.pagar(monto);
    }
}
