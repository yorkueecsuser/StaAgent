import java.util.logging.Level;
import java.util.logging.Logger;

class LogTagBugDemo {

    private static final Logger logger = Logger.getLogger(LogTagBugDemo.class.getName());

    public boolean showBug(String tag, Level level) {
        try {
            // This line will throw an IllegalArgumentException if the tag is longer than 23 characters
            return logger.isLoggable(level);  // BUG: IsLoggableTagLength
        } catch (IllegalArgumentException e) {
            System.err.println("Caught an IllegalArgumentException: " + e.getMessage());
            return false;
        }
    }
public static void main(String [] args){
    LogTagBugDemo demo = new LogTagBugDemo();
    demo = new LogTagBugDemo();
    String longTag = "ThisIsAVeryLongLogTagExceedingLimit";
    boolean result = demo.showBug(longTag , Level.INFO);
    System.out.println("Is loggable: " + result);
}
}