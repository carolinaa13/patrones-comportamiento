import Chainofresponsability.Asistente;
import Chainofresponsability.Coordinador;
import Chainofresponsability.Handler1;
import Chainofresponsability.Profesor;
import Command.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("***************** PROBANDO PATRONES ****************");
        System.out.println("--------------** Cadena de Responsabilidad **-------------");

        Handler1 basico = new Asistente();
        Handler1 intermedio = new Profesor();
        Handler1 experto = new Coordinador();
        basico.setNext(intermedio);
        intermedio.setNext(experto);
        basico.handle("Solicitud de tutorías", 1);
        basico.handle("Cupo completo", 3);

        System.out.println("---------------** Command **--------------");

       Solicitud seleccionar = new Solicitud();
        Command inscribir = new InscribirseCursoCommand(seleccionar);
        Command baja = new AbandonarCursoCommand(seleccionar);
        Command solicitar = new SolicitarCertificadoCommand(seleccionar);
        Invoker elegir = new Invoker();
        System.out.println("......Inscribirse a Cursado......");
        elegir.setCommand(inscribir);
        elegir.pressButton(); // Inscribirse a un curso
        System.out.println("......Cancelar Inscripcion......");
        elegir.pressUndo(); // Cancelar solicitud
        System.out.println("......Darse de Baja de un curso......");
        elegir.setCommand(baja);
        elegir.pressButton(); // Darse de baja de un curso
        System.out.println("......Cancelar Baja......");
        elegir.pressUndo(); // Cancelar la baja
        System.out.println("......Solicitar un Certificado......");
        elegir.setCommand(solicitar);
        elegir.pressButton(); // Realizar solicitud
        System.out.println("......Cancelar Solicitud......");
        elegir.pressUndo();// Cancelar Pedido de Certificado

    }
}