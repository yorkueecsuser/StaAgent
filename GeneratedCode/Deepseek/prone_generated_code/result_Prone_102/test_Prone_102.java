import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testLoopConditionChecker() {
        // TRIGGER BUG: LoopConditionChecker
        int n = 5;  // Any positive number will trigger the bug
        int expectedResult = 10;  // This is incorrect, actual result should be n*(n-1)/2
        int actualResult = buggyCode.showBug(n);
        assertEquals(expectedResult, actualResult);
    }
}