package commands.canvas;

import commands.Command;
import factories.ICanvas;
import utils.ParamsParser;

public class DrawPointCommand extends Command {

    private ICanvas _canvas = null;

    public DrawPointCommand( ICanvas canvas ) {
        _canvas = canvas;
    }

    @Override
    public void execute( Object... args ) {

        Integer x1 = ParamsParser.argumentToInt( args[0].toString() );
        Integer y1 = ParamsParser.argumentToInt( args[1].toString() );
        _canvas.drawPoint( x1, y1 );
    }
}
