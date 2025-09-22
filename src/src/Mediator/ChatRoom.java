package Mediator;

public class ChatRoom implements ChatMediator {
    private java.util.List<Usuario> usuarios = new java.util.ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(String mensaje, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) { // no se envía a sí mismo
                u.recibir(mensaje);
            }
        }
    }
}
