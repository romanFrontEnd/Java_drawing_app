package commands.canvas;

import commands.Command;
import exceptions.CanvasDrawingExceptions;
import factories.ICanvas;
import utils.ParamsParser;

public class DrawRectangularCommand extends Command {

    private ICanvas _canvas = null;

    public DrawRectangularCommand( ICanvas canvas ) {
        _canvas = canvas;
    }

    @Override
    public void execute( Object... args ) {

        Integer x1 = ParamsParser.argumentToInt( args[0].toString() );
        Integer y1 = ParamsParser.argumentToInt( args[1].toString() );
        Integer x2 = ParamsParser.argumentToInt( args[2].toString() );
        Integer y2 = ParamsParser.argumentToInt( args[3].toString() );

        if(x1 >  _canvas.getWidth() || x2 > _canvas.getWidth() || y1 > _canvas.getHeight() || y2 > _canvas.getHeight()) {
            CanvasDrawingExceptions.printOutOfBoundMessage();
            return;
        }
        _canvas.drawRectangle( x1, y1, x2, y2 );
    }
}
