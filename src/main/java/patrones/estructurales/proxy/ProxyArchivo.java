package patrones.estructurales.proxy;

public class ProxyArchivo implements Archivo{


    private ArchivoReal archivoReal;
    private Usuario usuario;

    public ProxyArchivo(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void leer(String nombreArchivo) {

        if (!usuario.getRol().equals("ADMIN")) {
            System.out.println("Acceso denegado para " + usuario.getNombre());
            return;
        }

        if (archivoReal == null) {
            archivoReal = new ArchivoReal(); // lazy loading
        }

        System.out.println("Acceso concedido a " + usuario.getNombre());
        archivoReal.leer(nombreArchivo);
    }
}
