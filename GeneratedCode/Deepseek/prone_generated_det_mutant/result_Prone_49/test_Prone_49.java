import org.junit.Test;
import java.util.logging.Logger;
import static org.junit.Assert.*;

public class MainTest {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    @Test
    public void testShowBug() {
        int a = 10;
        int b = 20;
        Main.showBug(a, b);  // TRIGGER BUG: FloggerFormatString
        // The bug here is that logger.info() is using a format string that is not a valid printf-style format string. 
        // Instead of using '%s', it's using '+' to concatenate strings. This will lead to a ClassCastException if the logger 
        // tries to format the string as a printf-style format string.
    }
}