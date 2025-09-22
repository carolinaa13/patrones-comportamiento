package Iterator;

public class Alumno {
    private String nombreAlumno;
    private java.util.List<Curso> cursos = new java.util.ArrayList<>();

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
    public CursoIterator iterator() {
        return new AlumnoIterator(cursos);
    }
}
