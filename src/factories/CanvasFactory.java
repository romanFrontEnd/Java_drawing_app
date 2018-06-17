package factories;

public class CanvasFactory implements ICanvasFactory {

    private enum CanvasTypes {
        CONSOLE,
        GUI,
        MAC
    }

    private String _mode= null;

    public CanvasFactory( String mode ) {
        this._mode = mode;
    }

    @Override
    public ICanvas getCanvas() {
        ICanvas canvas = null;
        if(_mode.equals( CanvasTypes.CONSOLE.toString())) {
            canvas = ConsoleCanvas.getInstance();
        } else {
            canvas = new GUICanvasFactory().getCanvas();
        }
        return canvas;
    }
}
