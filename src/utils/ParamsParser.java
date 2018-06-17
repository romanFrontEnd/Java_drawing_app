package utils;

public class ParamsParser {

    public static int argumentToInt( String arg ) {
        return Integer.parseInt( arg );
    }

    public static char argumentToChar( String arg ) {
        return arg.charAt( 0 );
    }

}
