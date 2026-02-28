import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidLosingExceptionInformationTest {
    AvoidLosingExceptionInformation avoidLosingExceptionInformation = new AvoidLosingExceptionInformation();

    @Test(expected = SomeException.class)
    public void testShowBug() {
        avoidLosingExceptionInformation.showBug();
        // TRIGGER BUG: AvoidLosingExceptionInformation
    }
}