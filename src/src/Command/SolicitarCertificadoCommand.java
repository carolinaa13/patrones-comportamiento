package Command;

public class SolicitarCertificadoCommand implements Command{
    private Solicitud solicitud;
    public SolicitarCertificadoCommand(Solicitud solicitud) { this.solicitud= solicitud; }
    public void execute() { solicitud.alta(); }
    public void undo() { solicitud.baja(); }


}
