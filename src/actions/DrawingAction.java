package actions;

import commands.Command;

public interface DrawingAction {
    public Command getCommand( String commandCode);
}
