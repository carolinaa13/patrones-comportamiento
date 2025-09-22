package Observer;

public interface Sujeto {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
