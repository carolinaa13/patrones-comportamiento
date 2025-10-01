package State;

public class EnEspera implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("Inscripción en Espera");
        inscripcion.setEstado(new Inscrito());

    }
}
