import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ImpureFunctionBugTest {

    @Test
    public void testImpureFunctionBug() {
        ImpureFunctionBug buggyInstance = new ImpureFunctionBug();
        List<Integer> expectedResult = Arrays.asList(0, 0, 0); // Expected result if the bug wasn't present
        List<Integer> actualResult = buggyInstance.showBug();

        // TRIGGER BUG: IMPURE_FUNCTION
        assertNotEquals(expectedResult, actualResult);
    }
}