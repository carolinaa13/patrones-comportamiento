package Memento;

public class Examen {
    private String contenido = "";
    public void escribir(String texto) {
        contenido += texto;
    }
    public String getContenido() {
        return contenido;
    }
    public Memento guardar() {
        return new Memento(contenido);
    }
    public void restaurar(Memento m) {
        contenido = m.getEstado();
    }

}
