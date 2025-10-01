package Visitor;

public class AlumnoRegular extends Alumno {

    public AlumnoRegular(String nombre, double cuota) {
        super(nombre, cuota);
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}
