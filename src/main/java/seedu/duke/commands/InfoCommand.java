package seedu.duke.commands;

public class InfoCommand extends Command {

    private String suLink =
            "https://ceg.nus.edu.sg/wp-content/uploads/sites/3/2020/12/SU-Briefing-2019_updatedURL.pdf";
    private String modRegLink =
            "https://ceg.nus.edu.sg/wp-content/uploads/sites/3/2020/07/20-July-Department-Welcome-Session-ModReg.pdf";
    private String plagiarismLink =
            "https://wts.indiana.edu/writing-guides/plagiarism.html";

    @Override
    public CommandResult executeCommand() {
        return new CommandResult(suLink + "\n" + modRegLink + "\n" + plagiarismLink);
    }
}
