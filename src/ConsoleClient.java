import actions.DrawingActions;
import dao.CommandDao;
import factories.CanvasFactory;
import factories.ICanvas;
import messages.SystemMessage;
import utils.CommandsParser;
import utils.CommandsValidator;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleClient {

    private static String mode = "CONSOLE";

    public static void main( String[] args ) throws IOException {
        System.out.print( SystemMessage.welcomeMessage + "\n" );
        System.out.print( "____________________________________\n" );

        Scanner scanner = new Scanner( System.in );
        ICanvas canvas = new CanvasFactory( mode ).getCanvas();
        CommandsValidator validator = new CommandsValidator();
        DrawingActions actions = new DrawingActions( canvas );
        System.out.print( "Create canvas to start drawing. Example C 10 10. Will create Canvas 10x10. Or type  H - for help!\n" );
        while( true ) {
            String input = scanner.nextLine();
            if( input.isEmpty() ) {
                System.out.print( "Enter command for drawing : " );
            } else {
                CommandDao dao = CommandsParser.parse( input );
                actions.doAction( dao.getCommandCode(), dao.getCommandParams() );
            }
        }
    }
}
