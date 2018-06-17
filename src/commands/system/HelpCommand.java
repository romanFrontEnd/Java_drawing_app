package commands.system;

import commands.Command;
import messages.SystemMessage;

public class HelpCommand extends Command {

    @Override
    public void execute(Object... args) {
        System.out.println( SystemMessage.helpMessage);
    }
}
