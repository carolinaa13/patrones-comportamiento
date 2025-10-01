package Visitor;

public class AlumnoBecado extends AlumnoVisitor implements VisitorAlumno  {

    public AlumnoBecado(String nombre, double cuota) {
        super(nombre,cuota);
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }





}