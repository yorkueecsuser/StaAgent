import java.util.logging.Level;
import java.util.logging.Logger;

class LogTagLengthBug {

    private static final Logger logger = Logger.getLogger(LogTagLengthBug.class.getName());
public boolean showBug() {
    String longTag = "ThisIsAVeryLongTagThatExceedsTheLimit";
    longTag = "ThisIsAVeryLongTagThatExceedsTheLimit";
    try { return logger.isLoggable(Level.INFO); } catch(IllegalArgumentException e){ System.out.println("Caught IllegalArgumentException: " + e.getMessage()); return false; }
}

    public static void main(String[] args) {
        LogTagLengthBug bugDemo = new LogTagLengthBug();
        bugDemo.showBug();
    }
}