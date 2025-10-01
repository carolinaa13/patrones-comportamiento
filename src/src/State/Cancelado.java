package State;

public class Cancelado implements EstadoInscripcion {

    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("Inscripción Cancelada");
        inscripcion.setEstado(new Inscrito());

    }
}
