import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryTypeArgumentBugTest {

    @Test
    public void testNonGenericMethodInvocation() {
        UnnecessaryTypeArgumentBug bugDemo = new UnnecessaryTypeArgumentBug();
        String expectedResult = "Non-generic method invoked";

        // TRIGGER BUG: UnnecessaryTypeArgument
        String actualResult = bugDemo.<String>nonGenericMethod();

        assertEquals(expectedResult, actualResult);
    }
}