package patrones.estructurales.flyweight;

public class TipoPersonaje implements Personaje {

    private String tipo;     // SOLDADO, MAGO, ARQUERO
    private String arma;     // espada, arco, bastón

    public TipoPersonaje(String tipo, String arma) {
        this.tipo = tipo;
        this.arma = arma;
    }

    @Override
    public void mostrar(int x, int y) {
        System.out.println(tipo + " con " + arma + " en posición (" + x + ", " + y + ")");
    }
}