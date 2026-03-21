import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidLogMessageFormatExampleTest {
    @Test
    public void testShowBug() {
        InvalidLogMessageFormatExample example = new InvalidLogMessageFormatExample();

        // TRIGGER BUG: InvalidLogMessageFormat
        // The bug is triggered by the line below as it logs messages with placeholders but no arguments.
        example.showBug();
    }
}