import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidLosingExceptionInformationTest {
    @Test
    public void testBug() {
        try {
            AvoidLosingExceptionInformation.doSomething();
            fail("Exception not thrown"); // TRIGGER BUG: AvoidLosingExceptionInformation
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}