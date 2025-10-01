package Visitor;

public abstract class AlumnoVisitor {
    protected String nombre;
    protected double cuota;

    public AlumnoVisitor(String nombre, double cuota) {
        this.nombre = nombre;
        this.cuota = cuota;}

    public String getNombre() {
        return this.nombre;
    }

    public double getCuota() {
        return this.cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public abstract void aceptar(Visitor visitor);
}
