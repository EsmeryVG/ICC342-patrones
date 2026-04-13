package patrones.estructurales.flyweight;

import java.util.HashMap;

public class FabricaPersonajes {

    private static final HashMap<String, TipoPersonaje> mapa = new HashMap<>();

    public static TipoPersonaje getPersonaje(String tipo) {

        TipoPersonaje personaje = mapa.get(tipo);

        if (personaje == null) {

            switch (tipo) {
                case "SOLDADO":
                    personaje = new TipoPersonaje("SOLDADO", "Espada");
                    break;
                case "MAGO":
                    personaje = new TipoPersonaje("MAGO", "Bastón");
                    break;
                case "ARQUERO":
                    personaje = new TipoPersonaje("ARQUERO", "Arco");
                    break;
            }

            mapa.put(tipo, personaje);
            System.out.println("Creando nuevo personaje tipo: " + tipo);
        }

        return personaje;
    }
}