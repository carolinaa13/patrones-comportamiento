package Chainofresponsability;

public class Asistente extends Handler1{
    protected boolean procesar(String problema, int nivel) {
        if (nivel <= 1) {
            System.out.println("Asistente resolvió: " + problema);
            return true;
        }
        return false;
    }
}
