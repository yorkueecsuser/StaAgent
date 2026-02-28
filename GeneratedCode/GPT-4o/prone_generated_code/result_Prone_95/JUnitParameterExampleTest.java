import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitParameterExampleTest {

    @Test
    public void testShowBug() {
        JUnitParameterExample example = new JUnitParameterExample();
        String result = example.showBug(); // TRIGGER BUG: JUnitParameterMethodNotFound

        // Since we're triggering the intentional bug, let's assert a known incorrect outcome
        // to ensure the test fails and demonstrates the bug.
        String expectedOutput = "For inputs 1 and 2, expected sum is 3, calculated sum is 3\n" +
                                "For inputs 4 and 5, expected sum is 9, calculated sum is 9\n" +
                                "For inputs 6 and 7, expected sum is 13, calculated sum is 13\n";
        assertEquals(expectedOutput, result); // TRIGGER BUG: JUnitParameterMethodNotFound
    }
}