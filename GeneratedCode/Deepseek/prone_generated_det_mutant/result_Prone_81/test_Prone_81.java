import org.junit.Test;
import static org.junit.Assert.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

public class InvalidJavaTimeConstantTest {

    @Test
    public void testShowBug() {
        InvalidJavaTimeConstant instance = new InvalidJavaTimeConstant();
        try {
            instance.showBug();
        } catch (DateTimeException e) {
            // The bug is expected to be triggered here
            return;
        }
        fail("Expected a DateTimeException to be thrown"); // TRIGGER BUG: InvalidJavaTimeConstant
    }
}