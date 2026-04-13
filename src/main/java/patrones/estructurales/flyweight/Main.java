package patrones.estructurales.flyweight;

public class Main {
    public static void main(String[] args) {
        // Ejemplo del patrón

        for (int i = 0; i < 5; i++) {
            Personaje soldado = FabricaPersonajes.getPersonaje("SOLDADO");
            soldado.mostrar(i, i * 2);
        }

        for (int i = 0; i < 3; i++) {
            Personaje mago = FabricaPersonajes.getPersonaje("MAGO");
            mago.mostrar(i + 10, i + 5);
        }
    }
}
