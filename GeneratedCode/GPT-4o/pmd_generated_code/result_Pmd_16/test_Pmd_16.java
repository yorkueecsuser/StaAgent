import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionHandlingExampleTest {

    @Test
    public void testShowBug() {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        String result = example.showBug(); // TRIGGER BUG: AvoidLosingExceptionInformation
        assertEquals("Exception message should be used or not retrieved", "Completed", result);
    }
}