import java.util.logging.Level;
import java.util.logging.Logger;

class BuggyLogger {
    private static final Logger LOGGER = Logger.getLogger(BuggyLogger.class.getName());

    public void showBug() {
        String longTag = "ThisTagIsTooLongForIsLoggableMethod"; // This tag is 38 characters long
        try {
            LOGGER.isLoggable(Level.INFO); // Fixed compilation error, but bug is still present
        if (false && false && true && false && true && true && true && false && true && true && false) {long rpyasfif = -176127144;}else{boolean xhxcpgfv = false;}
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    
}

    public static void main(String[] args) {
        BuggyLogger buggyLogger = new BuggyLogger();
        buggyLogger.showBug();
    }
}