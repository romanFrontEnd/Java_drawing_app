package messages;

public final class SystemMessage {
    public static String welcomeMessage = "\n Hi! \n \t Welcome to drawing app. \n\t This application allow you to draw different amazing figures.";
    public static String helpMessage = "!!Command parameters delimiter is space!!. You can use the next commands: \n" +
            " 1) C w h => C 10 20   - will draw Canvas with=10 and height=20 \n" +
            " 2) L x1 y1 x2 y2      - Should create a new line from (x1,y1) to (x2,y2). Currently only\n" +
            "                           horizontal or vertical lines are supported. Horizontal and vertical lines\n" +
            "                           will be drawn using the 'x' character.\n" +
            " 3) R x1 y1 x2 y2      - Should create a new rectangle, whose upper left corner is (x1,y1) and\n" +
            "                           lower right corner is (x2,y2). Horizontal and vertical lines will be drawn\n" +
            "                           using the 'x' character.\n" +
            " 4) B x y c            - Should fill the entire area connected to (x,y) with \"colour\" c. The\n" +
            "                           behaviour of this is the same as that of the \"bucket fill\" tool in paint\n" +
            "                           programs.\n" +
            "5) Q                   -  Should quit the program.";

    public static String errorMessage = "Some error occurs during program executions";
    public static String commandErrorMessage = "Some error occurs while you enter the command";
}
