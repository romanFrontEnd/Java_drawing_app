package utils;

public class CommandsValidator {

    public boolean isCanvasCommandValid( String input ) {
        String[] cmd = input.split( " " );
        if( cmd.length < 3 || cmd.length > 3 ) {
            System.out.print( "Command should have 3 parameters" );
            return false;
        }
        int width = Integer.parseInt( cmd[1] );
        int height = Integer.parseInt( cmd[2] );
        if( width > 1 && height > 1 ) {
            return true;
        }
        return true;
    }
}
