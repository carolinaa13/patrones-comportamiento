package Command;

public class InscribirseCursoCommand implements Command {
        private Solicitud solicitud;
        public InscribirseCursoCommand(Solicitud solicitud) { this.solicitud= solicitud; }
        public void execute() { solicitud.alta(); }
        public void undo() { solicitud.baja(); }
    }

