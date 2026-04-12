package patrones.estructurales.adapter;

interface Notificador {
    void enviarMensaje(String mensaje);
}

// Esta es la clase que ya existe
// Puede ser una librería externa o un sistema legado.
// Su interfaz no coincide con la que espera el cliente.
class WhatsAppAPI {
    private String numeroTelefono;

    public WhatsAppAPI(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void sendText(String phone, String text) {
        System.out.println("WhatsAppAPI -> Enviando al numero " + phone + ": " + text);
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}

// Adapter:
// Implementa la interfaz esperada por el cliente (Notificador)
// y por dentro usa la clase incompatible (WhatsAppAPI).
class WhatsAppAdapter implements Notificador {
    private WhatsAppAPI whatsAppAPI;

    public WhatsAppAdapter(WhatsAppAPI whatsAppAPI) {
        this.whatsAppAPI = whatsAppAPI;
    }

    public void enviarMensaje(String mensaje) {
        // Aquí ocurre la traducción:
        // el cliente llama enviarMensaje(...)
        // pero la API real entiende sendText(phone, text)
        whatsAppAPI.sendText(whatsAppAPI.getNumeroTelefono(), mensaje);
    }
}

// Cliente:
// Este código solo conoce la interfaz Notificador.
// No sabe si detrás hay correo, WhatsApp, SMS, etc.
class SistemaAlertas {
    private Notificador notificador;

    public SistemaAlertas(Notificador notificador) {
        this.notificador = notificador;
    }

    public void alertar(String mensaje) {
        System.out.println("SistemaAlertas -> Preparando alerta...");
        notificador.enviarMensaje(mensaje);
        System.out.println("SistemaAlertas -> Alerta enviada.");
    }
}


public class Main {
    public static void main(String[] args) {
        // Objeto incompatible que queremos reutilizar
        WhatsAppAPI apiExterna = new WhatsAppAPI("809-555-1234");

        // El adapter envuelve a la API externa
        Notificador adaptador = new WhatsAppAdapter(apiExterna);

        // El cliente trabaja con la interfaz esperada
        SistemaAlertas sistema = new SistemaAlertas(adaptador);

        sistema.alertar("Su pedido fue despachado.");
    }
}