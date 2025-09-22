package Iterator;

public class AlumnoIterator implements CursoIterator{
    private final java.util.List<Curso> cursos;
    private int posicion = 0;
    public AlumnoIterator(java.util.List<Curso> cursos) {
        this.cursos= cursos;
    }
    public boolean hasNext() {
        return posicion < cursos.size();
    }
    public Curso next() {
        return cursos.get(posicion++);
    }

}
