package Chainofresponsability;

public class Profesor extends Handler1{
    protected boolean procesar(String problema, int nivel) {
        if (nivel == 2) {
            System.out.println("Profesor resolvió: " + problema);
            return true;
        }
        return false;
    }
}
