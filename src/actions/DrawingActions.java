package actions;

import commands.Command;
import commands.canvas.DrawLineCommand;
import commands.canvas.DrawRectangularCommand;
import commands.canvas.FillAreaCommand;
import commands.system.DrawCanvasCommand;
import commands.system.HelpCommand;
import commands.system.QuitCommand;
import factories.ICanvas;

import java.util.HashMap;
import java.util.Map;

public class DrawingActions {

        private Map<String, Command> _strategies = new HashMap<String, Command>();

    private enum  DrawingActionCodes {
        Q,
        H,
        C,
        L,
        R,
        B // fill bucket
    }

    public DrawingActions( ICanvas canvas) {
        _strategies.put( DrawingActionCodes.Q.toString(), new QuitCommand() );
        _strategies.put( DrawingActionCodes.H.toString(), new HelpCommand() );
        _strategies.put( DrawingActionCodes.C.toString(), new DrawCanvasCommand(canvas));
        _strategies.put( DrawingActionCodes.L.toString(), new DrawLineCommand(canvas));
        _strategies.put( DrawingActionCodes.R.toString(), new DrawRectangularCommand(canvas));
        _strategies.put( DrawingActionCodes.B.toString(), new FillAreaCommand( canvas));
    }

    public void doAction(String commandCode, Object... args){
        _strategies.get( commandCode ).execute(args);
    }
}
