package patrones.creacionales.singleton;

// Demostración del uso del patrón Singleton
public class Main {
    public static void main(String[] args) {

        // Se obtiene la instancia del Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("Primer mensaje");

        // Se vuelve a solicitar la instancia
        Logger logger2 = Logger.getInstance();
        logger2.log("Segundo mensaje");

        // Se compara si ambas referencias apuntan al mismo objeto
        if (logger1 == logger2) {
            System.out.println("Es la misma instancia");
        } else {
            System.out.println("Son diferentes instancias");
        }
    }
}