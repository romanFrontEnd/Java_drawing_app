package commands.system;

import commands.Command;

public class QuitCommand extends Command {

    @Override
    public void execute(Object... args) {
        System.out.println("Exit!");
        System.exit(0);
    }
}
