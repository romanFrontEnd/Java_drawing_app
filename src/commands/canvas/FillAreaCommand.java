package commands.canvas;

import commands.Command;
import factories.ICanvas;
import utils.ParamsParser;

public class FillAreaCommand extends Command {

    private ICanvas _canvas = null;

    public FillAreaCommand( ICanvas canvas ) {
        _canvas = canvas;
    }

    @Override
    public void execute( Object... args ) {
        Integer x1 = ParamsParser.argumentToInt( args[0].toString() );
        Integer y1 = ParamsParser.argumentToInt( args[1].toString() );
        char fillAreaChar = ParamsParser.argumentToChar( args[2].toString() );
        _canvas.fillAreaChar( fillAreaChar );
        _canvas.fillArea( x1, y1 );
    }
}
