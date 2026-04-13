package patrones.comportamiento.templatemethod;

public class Main {
    public static void main(String[] args) {
        // Ejemplo del patrón

        Bebida cafe = new Cafe();
        Bebida te = new Te();

        System.out.println("---- Café ----");
        cafe.preparar();

        System.out.println("\n---- Té ----");
        te.preparar();
    }
}
