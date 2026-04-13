package patrones.estructurales.proxy;

public class Usuario {

    private String nombre;
    private String rol;

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }
}
