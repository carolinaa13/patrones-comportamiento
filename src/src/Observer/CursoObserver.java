package Observer;

import java.util.*;

public class CursoObserver implements Sujeto{
    private List<Observer> observers = new ArrayList<>();
    private String avisos;
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void setAvisos(String avisos) {
        this.avisos= avisos;
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(avisos);
        }
    }

}
