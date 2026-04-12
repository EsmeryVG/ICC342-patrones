package patrones.creacionales.singleton;

public class Logger {

    // Variable estática que guarda la única instancia de la clase
    private static Logger instancia;

    // Constructor privado:
    // Evita que otras clases puedan crear objetos usando "new"
    private Logger() {
        System.out.println("Logger inicializado");
    }

    // Metodo estático que permite acceder a la única instancia
    public static Logger getInstance() {

        // Si la instancia aún no existe, se crea
        if (instancia == null) {
            instancia = new Logger();
        }

        // Siempre devuelve la misma instancia
        return instancia;
    }

    // Metodo de ejemplo para mostrar funcionalidad del logger
    public void log(String mensaje) {
        System.out.println("LOG: " + mensaje);
    }
}