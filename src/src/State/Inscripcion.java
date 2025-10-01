package State;

public class Inscripcion {

    private EstadoInscripcion estado;
    public Inscripcion() {
        estado = new EnEspera();
        }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }
    public void cambiarEstado() { estado.cambiarEstado(this); }


}
