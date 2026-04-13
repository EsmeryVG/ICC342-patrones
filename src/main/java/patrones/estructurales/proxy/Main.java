package patrones.estructurales.proxy;

public class Main {
    public static void main(String[] args) {

        Usuario admin = new Usuario("Carlos", "ADMIN");
        Usuario user = new Usuario("Ana", "USER");

        Archivo archivoAdmin = new ProxyArchivo(admin);
        Archivo archivoUser = new ProxyArchivo(user);

        archivoAdmin.leer("datos.txt");
        System.out.println("-----------------");
        archivoUser.leer("datos.txt");
    }
}