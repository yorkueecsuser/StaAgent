import org.junit.Test;
import static org.junit.Assert.*;

public class MoreThanOneLoggerTest {
    MoreThanOneLogger moreThanOneLogger = new MoreThanOneLogger();

    @Test // TRIGGER BUG: MoreThanOneLogger
    public void testShowBug() {
        moreThanOneLogger.showBug();
    }
}