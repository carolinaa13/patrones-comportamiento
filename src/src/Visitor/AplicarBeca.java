package Visitor;

public class AplicarBeca implements Visitor {

    @Override
    public void visitar(AlumnoRegular alumno) {
        System.out.println("Alumno regular " + alumno.getNombre() + " paga cuota completa: $" + alumno.getCuota());
    }

    @Override
    public void visitar(AlumnoBecado alumno) {
        double descuento = alumno.getCuota() * 0.5; // 50% de beca
        alumno.setCuota(alumno.getCuota() - descuento);
        System.out.println("Alumno becado " + alumno.getNombre() + " recibe 50% de descuento. Nueva cuota: $" + alumno.getCuota());
    }
}
