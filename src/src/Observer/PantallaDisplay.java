package Observer;

public class PantallaDisplay implements Observer {
    private String nombre;
    public PantallaDisplay(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void update(String avisos) {
        System.out.println(nombre + " muestra nuevos cursos " + avisos);
    }

}
