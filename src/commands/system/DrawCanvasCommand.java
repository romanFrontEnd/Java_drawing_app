package commands.system;

import commands.Command;
import factories.ConsoleCanvas;
import factories.ICanvas;
import utils.ParamsParser;

public class DrawCanvasCommand extends Command {

    private ICanvas _canvas;
    private int w;
    private int h;

    public DrawCanvasCommand( ICanvas canvas ) {
        _canvas = canvas;
    }

    @Override
    public void execute( Object... args ) {
        _canvas.width( ParamsParser.argumentToInt( args[0].toString() ) );
        _canvas.height( ParamsParser.argumentToInt( ( args[1].toString() ) ) );
        _canvas.create();
        _canvas.render();
    }
}
