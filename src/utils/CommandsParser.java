package utils;

import commands.Command;
import dao.CommandDao;

import java.io.IOException;

public class CommandsParser {

    public static CommandDao parse( String input ) throws IOException {
        String commandInput = input.toUpperCase().trim();
        String[] commandInputArray = commandInput.split( " " );
        String commandCode = commandInputArray[0];
        String[] commandParams = new String[commandInputArray.length];
        System.arraycopy( commandInputArray, 1 , commandParams,  0, commandInputArray.length-1);
        CommandDao dao = new CommandDao();
        dao.setCommandCode( commandCode );
        dao.setCommandParams( commandParams );
        return dao;
    }
}
