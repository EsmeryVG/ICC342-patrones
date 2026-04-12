package patrones.comportamiento.mediator;

// Usuario concreto:
class UsuarioChat extends Usuario {

    public UsuarioChat(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(this.nombre + " envia: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println(this.nombre + " recibe: " + mensaje);
    }
}