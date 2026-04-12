package patrones.comportamiento.mediator;

public class Main {
    public static void main(String[] args) {

        ChatMediator chat = new ChatSala();

        Usuario u1 = new UsuarioChat(chat, "Ana");
        Usuario u2 = new UsuarioChat(chat, "Luis");
        Usuario u3 = new UsuarioChat(chat, "Carlos");

        chat.agregarUsuario(u1);
        chat.agregarUsuario(u2);
        chat.agregarUsuario(u3);

        u1.enviar("Hola a todos");
        u2.enviar("Hola Ana");
    }
}