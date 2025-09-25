package commandPattern;

public class SmartHomeHub {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String executeCommand() {
        if (command != null) {
            return command.execute();
        }
        return "No command set";
    }

}
