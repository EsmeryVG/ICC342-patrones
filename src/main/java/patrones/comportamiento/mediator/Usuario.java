package patrones.comportamiento.mediator;

// Clase abstracta Colleague:
// Representa a los objetos que se comunican a través del mediator
abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(ChatMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}