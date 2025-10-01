package Strategy;

import java.util.List;

public class AlumnoStrategy {
    private CalculoNota calculo;
    public AlumnoStrategy(CalculoNota calculo) {
        this.calculo = calculo;
    }
    public void setCalculo(CalculoNota calculo) {
        this.calculo = calculo;
    }
    public float Calificar(List<Integer> notas) {
        System.out.println("Calificación Final: " + calculo.calcular(notas));
        return 0;
    }
}
