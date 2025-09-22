package Memento;

public class Historial {
    private java.util.Stack<Memento> historial = new java.util.Stack<>();
    public void guardar(Memento m) { historial.push(m); }
    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}
