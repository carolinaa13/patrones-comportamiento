package Visitor;

public class AlumnoRegular extends AlumnoVisitor implements VisitorAlumno {
    public AlumnoRegular(String nombre, double cuota) {
        super(nombre, cuota);
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }

}




