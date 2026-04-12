package patrones.comportamiento.mediator;

// Interfaz Mediator:
// Define cómo se comunican los objetos
interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);
}