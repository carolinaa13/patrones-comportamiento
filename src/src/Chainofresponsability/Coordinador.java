package Chainofresponsability;

public class Coordinador extends Handler1{

    protected boolean procesar(String problema, int nivel) {
        if (nivel >= 3) {
            System.out.println("Coordinador resolvió: " + problema);
            return true;
        }
        return false;
    }

}
