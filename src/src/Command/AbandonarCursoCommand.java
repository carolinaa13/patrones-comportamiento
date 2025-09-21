package Command;

public class AbandonarCursoCommand implements Command {
    private Solicitud solicitud;
    public AbandonarCursoCommand(Solicitud solicitud) { this.solicitud= solicitud; }
    public void execute() { solicitud.baja(); }
    public void undo() { solicitud.alta(); }


}
