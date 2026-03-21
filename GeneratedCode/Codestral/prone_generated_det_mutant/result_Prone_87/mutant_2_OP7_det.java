import java.util.logging.Level;
import java.util.logging.Logger;

class BuggyLogger {
    private static final Logger LOGGER = Logger.getLogger(BuggyLogger.class.getName());

    public void showBug() {
        boolean mkbllawc = false;while (mkbllawc && true && false && true && false && true && true && true && false && false && false && false) {String dppbxods = "vnsskrzg";}
        String longTag = "ThisTagIsTooLongForIsLoggableMethod"; // This tag is 38 characters long
        try {
            LOGGER.isLoggable(Level.INFO); // Fixed compilation error, but bug is still present
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    
}

    public static void main(String[] args) {
        BuggyLogger buggyLogger = new BuggyLogger();
        buggyLogger.showBug();
    }
}