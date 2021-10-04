package seedu.duke;

import seedu.duke.commands.CalculateCapCommand;
import seedu.duke.commands.Command;
import seedu.duke.commands.ExitCommand;
import seedu.duke.commands.HelpCommand;
import seedu.duke.commands.InfoCommand;
import seedu.duke.commands.InvalidCommand;

public class Parser {

    public static Command parseCommand(String input) {

        String trimmedInput = input.trim();
        String commandWord = trimmedInput.split(" ")[0];
        String argument = trimmedInput.replaceFirst(commandWord, "").trim();

        switch (commandWord.toLowerCase()) {
        case "info":
            return new InfoCommand();
        case "help":
            return new HelpCommand();
        case "cap":
            return new CalculateCapCommand(input);
        case "bye":
            return new ExitCommand();
        default:
            return new InvalidCommand();
        }
    }
}
