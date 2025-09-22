import Chainofresponsability.Asistente;
import Chainofresponsability.Coordinador;
import Chainofresponsability.Handler1;
import Chainofresponsability.Profesor;
import Command.*;
import Iterator.Alumno;
import Iterator.Curso;
import Iterator.CursoIterator;
import Mediator.ChatMediator;
import Mediator.ChatRoom;
import Mediator.UsuarioConcreto;
import Memento.Examen;
import Memento.Historial;
import Observer.CursoObserver;
import Observer.PantallaDisplay;


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

        System.out.println("--------------** Iterator **--------------");

        Alumno alumno = new Alumno();
        alumno.setNombreAlumno("Joaquín Martínez");
        alumno.agregarCurso(new Curso("Diseño de Sistemas"));
        alumno.agregarCurso(new Curso("Desarrollo de Software"));
        alumno.agregarCurso(new Curso("Base de Datos"));
        CursoIterator it = alumno.iterator();
        System.out.println("Lista de Cursos para el alumno" +" " + alumno.getNombreAlumno());
        while (it.hasNext()) {
            System.out.println(it.next().getNombre());
        }

        System.out.println("--------------** Mediator **---------------");
        ChatMediator sala = new ChatRoom();
        UsuarioConcreto u1 = new UsuarioConcreto(sala, "Alumno");
        UsuarioConcreto u2 = new UsuarioConcreto(sala, "Profesor");
        sala.agregarUsuario(u1);
        sala.agregarUsuario(u2);
        u1.enviar("Buenas tardes Profesor!! Tengo una duda sobre el ejercicio de Patrones");
        u2.enviar("Buenas tardes! ¿Cúal es tu duda?");
        u1.enviar("Quisiera saber cúal es la fecha de entrega y el formato en que se debe entregar");

        System.out.println("------------** Memento **--------------");

        Examen examen = new Examen();
        Historial historial = new Historial();
        examen.escribir("Respuestas Examen: ");
        historial.guardar(examen.guardar());
        examen.escribir(" Pregunta 1: ");
        historial.guardar(examen.guardar());
        System.out.println("Actual: " + examen.getContenido()); // Muestra lo guardado hasta ese momento
        examen.escribir("Un bucle debe tener break para no ser infinito");
        historial.guardar(examen.guardar());
        System.out.println("Actual: " + examen.getContenido());
// Deshacer una vez
        examen.restaurar(historial.deshacer());
        System.out.println("Undo 1: " + examen.getContenido());
// Deshacer otra vez
        examen.restaurar(historial.deshacer());
        System.out.println("Undo 2: " + examen.getContenido()); // vuelve a lo primero que se guardó

        System.out.println("-------------** Observer **----------------");
        CursoObserver curso = new CursoObserver();
        PantallaDisplay display1 = new PantallaDisplay("Display 1");
        PantallaDisplay display2 = new PantallaDisplay("Display 2");
        curso.addObserver(display1);
        curso.addObserver(display2);
        curso.setAvisos("Inscripciones Abiertas: 'Curso de Programación Avanzado'");
        curso.setAvisos("Próximo Cierre de Inscripciones: 'Curso de Base de Datos NoSQL'");

    }
}