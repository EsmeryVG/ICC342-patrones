package patrones.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

// Implementación concreta del Mediator
class ChatSala implements ChatMediator {

    private List<Usuario> usuarios;

    public ChatSala() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario emisor) {
        // Envía el mensaje a todos menos al que lo envió
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje);
            }
        }
    }
}