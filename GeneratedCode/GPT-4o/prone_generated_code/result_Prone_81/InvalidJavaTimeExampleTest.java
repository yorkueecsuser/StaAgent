import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidJavaTimeExampleTest {

    @Test
    public void testInvalidMonthInLocalDateTime() {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        // The following call should trigger a DateTimeException due to invalid month
        example.showBug(); // TRIGGER BUG: InvalidJavaTimeConstant
        // The test will automatically fail if the exception is thrown
    }

    @Test
    public void testInvalidDayInLocalDateTime() {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        // The following call should trigger a DateTimeException due to invalid day
        example.showBug(); // TRIGGER BUG: InvalidJavaTimeConstant
        // The test will automatically fail if the exception is thrown
    }
}