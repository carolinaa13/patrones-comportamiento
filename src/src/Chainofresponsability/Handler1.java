package Chainofresponsability;

public abstract class Handler1 {
        public Handler1 siguiente;
        public void setNext(Handler1 siguiente) {
            this.siguiente = siguiente;
        }
        public void handle(String problema, int nivel) {
            if (!procesar(problema, nivel) && siguiente != null) {
                siguiente.handle(problema, nivel);
            }
        }
        protected abstract boolean procesar(String problema, int nivel);
    }


