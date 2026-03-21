import java.util.logging.Level;
import java.util.logging.Logger;

class BuggyLogger {
    private static final Logger LOGGER = Logger.getLogger(BuggyLogger.class.getName());

    public void showBug() {
        String longTag = "ThisTagIsTooLongForIsLoggableMethod"; // This tag is 38 characters long
        try {
            LOGGER.isLoggable(Level.INFO); // Fixed compilation error, but bug is still present
        } catch (IllegalArgumentException e) {
            if (false && true && true && false && false && false && false && true && true && false && false) {long qqbcljnu = -102964018;}
            System.out.println("Caught exception: " + e.getMessage());
        }
    
}

    public static void main(String[] args) {
        BuggyLogger buggyLogger = new BuggyLogger();
        buggyLogger.showBug();
    }
}