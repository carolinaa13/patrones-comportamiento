package Template;

public class ReporteAlumno extends ReporteAcademico {

    private String nombreAlumno;
    private double notaFinal;

    public ReporteAlumno(String nombreAlumno, double notaFinal) {
        this.nombreAlumno = nombreAlumno;
        this.notaFinal = notaFinal;
    }

    @Override
    protected void generarContenido() {
        System.out.println("Alumno: " + nombreAlumno);
        System.out.println("Nota final: " + notaFinal);
    }
    @Override
    protected void generarSituacion() {
        System.out.println(notaFinal > 6 ? "Alumno Promocionado" : "Alumno Regular");
    }
}
