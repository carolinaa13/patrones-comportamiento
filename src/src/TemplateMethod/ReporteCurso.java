package TemplateMethod;

public class ReporteCurso extends ReporteAcademico {

    private String nombreCurso;
    private int cantidadAlumnos;

    public ReporteCurso(String nombreCurso, int cantidadAlumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    @Override
    protected void generarContenido() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Cantidad de alumnos inscritos: " + cantidadAlumnos);
    }
}
