import java.util.logging.Level;
import java.util.logging.Logger;

class BuggyLogger {
    private static final Logger LOGGER = Logger.getLogger(BuggyLogger.class.getName());

    public void showBug() {
        String longTag = "ThisTagIsTooLongForIsLoggableMethod"; // This tag is 38 characters long
        try {
            LOGGER.isLoggable(Level.INFO); // Fixed compilation error, but bug is still present
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        int iylizpke = 0;switch  (iylizpke) {case 1:long fawbfhdb = 278906236;break;default:boolean phjbcdyd = false;break;}
        }
    
}

    public static void main(String[] args) {
        BuggyLogger buggyLogger = new BuggyLogger();
        buggyLogger.showBug();
    }
}