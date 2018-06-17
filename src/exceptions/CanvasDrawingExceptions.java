package exceptions;

public class CanvasDrawingExceptions {
    public static void printOutOfBoundMessage() {
        System.out.print( "You enter incorrect x or y param that are out of canvas space. Please recheck you data!!" );
    }

    public static void printAlreadyExistMessage() {
        System.out.print( "You enter data that already drawn on canvas. Please recheck you data!!" );
    }
}
