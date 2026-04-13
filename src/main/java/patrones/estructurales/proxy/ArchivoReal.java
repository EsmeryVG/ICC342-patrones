package patrones.estructurales.proxy;

public class ArchivoReal implements Archivo {

    @Override
    public void leer(String nombreArchivo) {
        System.out.println("Leyendo archivo: " + nombreArchivo);
    }
}
