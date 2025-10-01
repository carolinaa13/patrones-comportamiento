package Visitor;

public abstract class Alumno {
    protected String nombre;
    protected double cuota;

    public Alumno(String nombre, double cuota) {
        this.nombre = nombre;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public abstract void aceptar(Visitor visitor);
}
