package factories;

public interface ICanvas extends ICanvasDimensions,ICanvasBrushes {

    public void create();
    public void render();
    public void drawRectangle(int x1, int y1, int x2, int y2);
    public void drawLine( int x1, int y1, int x2, int y2);
    public void drawPoint(int x1, int y1);
    public void fillArea(int x, int y);

}
