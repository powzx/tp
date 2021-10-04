package seedu.duke.commands;

public class InfoCommand extends Command {

    protected String description;

    @Override
    public CommandResult executeCommand() {
        return new CommandResult(description);
    }
}
