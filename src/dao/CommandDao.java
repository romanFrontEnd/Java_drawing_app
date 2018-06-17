package dao;

public class CommandDao {
    private String commandCode;

    public String getCommandCode() {
        return commandCode;
    }

    public void setCommandCode( String commandCode ) {
        this.commandCode = commandCode;
    }

    public String[] getCommandParams() {
        return commandParams;
    }

    public void setCommandParams( String[] commandParams ) {
        this.commandParams = commandParams;
    }

    private String[] commandParams;



}
