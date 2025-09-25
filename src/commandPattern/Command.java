package commandPattern;

// Command interface for all device commands
public interface Command {
    String execute(); // Executes the command and returns a status message
}