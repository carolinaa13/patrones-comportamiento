package Visitor;

public class AplicarBeca implements Visitor {

    @Override
    public void visitar(AlumnoRegular alumnor) {
        System.out.println("Alumno regular " + alumnor.getNombre() + " paga cuota completa: $" + alumnor.getCuota());
    }

    @Override
    public void visitar(AlumnoBecado alumnob) {
        double descuento = alumnob.getCuota() * 0.5; // 50% de beca
        alumnob.setCuota(alumnob.getCuota() - descuento);
        System.out.println("Alumno becado " + alumnob.getNombre() + " recibe 50% de descuento. Nueva cuota: $" + alumnob.getCuota());
    }
}
