package commands.canvas;

import commands.Command;
import factories.ICanvas;
import utils.ParamsParser;

public class DrawLineCommand extends Command {

    private ICanvas _canvas = null;

    public DrawLineCommand( ICanvas canvas ) {
        _canvas = canvas;
    }

    @Override
    public void execute( Object... args ) {
        Integer x1 = ParamsParser.argumentToInt( args[0].toString() );
        Integer y1 = ParamsParser.argumentToInt( args[1].toString() );
        Integer x2 = ParamsParser.argumentToInt( args[2].toString() );
        Integer y2 = ParamsParser.argumentToInt( args[3].toString() );
        _canvas.drawLine( x1, y1, x2, y2 );
    }
}
