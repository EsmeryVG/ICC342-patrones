package patrones.comportamiento.chainofresponsibility;

public class Main {
    public static void main(String[] args) {

        Aprobador empleado = new Empleado();
        Aprobador gerente = new Gerente();
        Aprobador director = new Director();

        // Construir la cadena
        empleado.setSiguiente(gerente);
        gerente.setSiguiente(director);

        // Pruebas
        empleado.aprobar(50);
        empleado.aprobar(500);
        empleado.aprobar(5000);
    }
}