package Strategy;

import java.util.List;

public class ExamenExtra implements CalculoNota{
    @Override
    public float calcular(List<Integer> notas) {
        Integer promedio;
        Integer suma =0;
        notas.add(8);

        for (int i = 0; i < notas.size(); i++) {

            suma = suma+ notas.get(i);
        }
        promedio = suma / notas.size();

        return promedio; //Promedio con Examen Extra
    }
}
