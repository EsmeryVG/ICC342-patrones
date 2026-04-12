package patrones.estructurales.decorator;

// Interfaz componente:
// Define la operación común que tendrán tanto el objeto base
// como todos los decoradores.
interface Notificacion {
    void enviar(String mensaje);
}

// Componente concreto:
// Es la funcionalidad base, sin añadidos extra.
class NotificacionBasica implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación básica: " + mensaje);
    }
}

// Decorador base:
// Implementa la misma interfaz que el componente
// y contiene una referencia a otro objeto Notificacion.
// Su función principal es delegar la operación al objeto envuelto.
abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        // Delegación al objeto envuelto
        notificacion.enviar(mensaje);
    }
}

// Decorador concreto:
// Añade el comportamiento de enviar por email.
class EmailDecorator extends NotificacionDecorator {

    public EmailDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        // Primero se ejecuta el comportamiento anterior
        super.enviar(mensaje);

        // Luego se agrega la nueva responsabilidad
        System.out.println("Enviando copia por EMAIL: " + mensaje);
    }
}

// Decorador concreto:
// Añade el comportamiento de enviar por SMS.
class SMSDecorator extends NotificacionDecorator {

    public SMSDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        // Mantiene el comportamiento previo
        super.enviar(mensaje);

        // Agrega una nueva acción
        System.out.println("Enviando copia por SMS: " + mensaje);
    }
}

// Decorador concreto:
// Añade el comportamiento de registrar la notificación en un log.
class LogDecorator extends NotificacionDecorator {

    public LogDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        // Ejecuta primero lo que ya tenía el objeto decorado
        super.enviar(mensaje);

        // Agrega el registro adicional
        System.out.println("Guardando en LOG: notificación enviada correctamente");
    }
}

// Clase principal para probar el patrón
public class Main {
    public static void main(String[] args) {

        // 1. Se crea la notificación base
        Notificacion notificacion = new NotificacionBasica();

        System.out.println("=== Notificación básica ===");
        notificacion.enviar("Su pedido ha sido procesado.");

        System.out.println();

        // 2. Se decora con envío por email
        Notificacion notificacionEmail = new EmailDecorator(new NotificacionBasica());

        System.out.println("=== Notificación con email ===");
        notificacionEmail.enviar("Su pedido ha sido procesado.");

        System.out.println();

        // 3. Se decora con email + SMS + log
        Notificacion notificacionCompleta =
                new LogDecorator(
                        new SMSDecorator(
                                new EmailDecorator(
                                        new NotificacionBasica()
                                )
                        )
                );

        System.out.println("=== Notificación completa ===");
        notificacionCompleta.enviar("Su pedido ha sido procesado.");
    }
}