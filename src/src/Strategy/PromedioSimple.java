package Strategy;

import java.util.List;

public class PromedioSimple implements CalculoNota {
    @Override
    public float calcular(List<Integer> notas) {
        Integer promedio;
        Integer suma =0;

        for (int i = 0; i < notas.size(); i++) {

                suma = suma+ notas.get(i);
            }
            promedio = suma / notas.size();

            return promedio; //Promedio simple
        }
    }
