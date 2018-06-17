package factories;

import exceptions.CanvasDrawingExceptions;

import java.util.Arrays;

public class ConsoleCanvas implements ICanvas {
    private static ConsoleCanvas ourInstance = new ConsoleCanvas();

    public static ConsoleCanvas getInstance() {
        return ourInstance;
    }

    private char VBorder = '|';
    private char HBorder = '-';
    private char[][] canvasPlot;
    private char canvasEmptyChar = ' ';
    private char canvasFillChar = 'x';
    private char fillBucketChar = 'o';
    private int width;
    private int height;

    @Override
    public void width( int w ) {
        this.width = w;
    }

    @Override
    public int getWidth(){
        return this.width;
    }

    @Override
    public int getHeight(){
        return this.height;
    }

    @Override
    public void height( int h ) {
        this.height = h;
    }

    @Override
    public void fillAreaChar( char chr ) {
        this.fillBucketChar = chr;
    }

    public void create() {
        this.height += 2;
        this.width += 2;
        canvasPlot = new char[width][height];
        for( char[] e : canvasPlot ) {
            Arrays.fill( e, canvasEmptyChar );
        }
        drawCanvasBorders();
    }

    private void drawCanvasBorders() {
        drawBorder( 0, 0, this.height - 1, 0, HBorder );
        drawBorder( 0, this.height - 1, this.width - 1, this.height - 1, HBorder );
        drawBorder( 0, 1, 0, this.height - 2, VBorder );
        drawBorder( this.width - 1, 1, this.width - 1, this.height - 2, VBorder );
    }

    private void drawBorder( int x1, int y1, int x2, int y2, char border ) {
        for( int i = y1; i <= y2; i++ ) {
            for( int j = x1; j <= x2; j++ ) {
                canvasPlot[i][j] = border;
            }
        }
    }

    public void render() {
        for( int i = 0; i < this.width; i++ ) {
            for( int j = 0; j < this.height; j++ ) {
                System.out.print( canvasPlot[i][j] );
            }
            System.out.println();
        }
    }

    public void drawLine( int x1, int y1, int x2, int y2 ) {
        for( int i = x1; i <= x2; i++ ) {
            for( int j = y1; j <= y2; j++ ) {
                drawPoint( i, j );
            }
        }
        this.render();
    }

    public void drawPoint( int x1, int y1 ) {
        canvasPlot[x1][y1] = canvasFillChar;
    }

    public void drawRectangle( int x1, int y1, int x2, int y2 ) {
        drawLine( x1, y1, x2, y1 );
        drawLine( x1, y1, x1, y2 );
        drawLine( x2, y1, x2, y2 );
        drawLine( x1, y2, x2, y2 );
        this.render();
    }

    public void fillArea( int x, int y ) {
        if( (int) canvasPlot[x][y] != canvasEmptyChar ) {
            CanvasDrawingExceptions.printAlreadyExistMessage();
            return;
        }
        int i,j = 1;
        for(i = 1; i <= x; i++) {
            fillAreaPoint(i,j);
            for( j = 1; j <= y; j++) {
                fillAreaPoint(i,j);
            }
        }
        this.render();
    }

    private void fillAreaPoint(int x, int y) {
        if( (int) canvasPlot[x][y] == canvasEmptyChar ) {
            canvasPlot[x][y] = fillBucketChar;
            System.out.print("x =" + x + " y = " + y + " char = " + fillBucketChar + "\n");
        }
    }

}
