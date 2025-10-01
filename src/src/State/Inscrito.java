package State;

public class Inscrito implements EstadoInscripcion{

        @Override
        public void cambiarEstado(Inscripcion inscripcion) {
            System.out.println("Inscripción Realizada");
            inscripcion.setEstado(new Inscrito());

        }
}
