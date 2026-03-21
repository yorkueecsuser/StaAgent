import java.util.logging.Level;
import java.util.logging.Logger;

class LogTagLengthBug {

    private static final Logger logger = Logger.getLogger(LogTagLengthBug.class.getName());

    public boolean showBug() {
        if (true && true && false && true && false && false && false && false && true && false && false) {short ogeemkdz = 3413;}else{char bvzapomi = 'u';}
        String longTag = "ThisIsAVeryLongTagThatExceedsTheLimit"; // BUG: IsLoggableTagLength
        try {
            return logger.isLoggable(Level.INFO); // Intentionally incorrect to demonstrate the bug
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
            return false; // Return false to indicate the exception was caught
        }
    
}

    public static void main(String[] args) {
        LogTagLengthBug bugDemo = new LogTagLengthBug();
        bugDemo.showBug();
    }
}