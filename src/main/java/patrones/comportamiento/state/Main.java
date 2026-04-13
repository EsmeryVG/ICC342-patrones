package patrones.comportamiento.state;

interface VendingMachineState {
    void handleRequest();
}

class ReadyState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Estado listo: Por favor seleccione un producto.");
    }
}

class ProductSelectedState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Estado de producto seleccionado: Procesando pago.");
    }
}

class PaymentPendingState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Estado de entrega: Entregando producto.");
    }
}

class OutOfStockState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Estado sin stock: sin stock de este producto, por favor seleccione otro producto.");
    }
}

class OutOfSserviceState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Estado fuera de servicio: Máquina fuera de servicio, por fafor, vuelve más tarde.");
    }
}

class VendingMachineContext {
    private VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create context
        VendingMachineContext vendingMachine = new VendingMachineContext();

        // Set initial state
        vendingMachine.setState(new ReadyState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new ProductSelectedState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new PaymentPendingState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new OutOfStockState());

        // Request state change
        vendingMachine.request();

        vendingMachine.setState(new OutOfSserviceState());

        // Request state change
        vendingMachine.request();
    }
}