package Command;

public class Invoker {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void pressButton() { command.execute(); }
    public void pressUndo() { command.undo(); }
}
