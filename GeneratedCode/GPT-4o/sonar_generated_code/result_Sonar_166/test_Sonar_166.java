import org.junit.Test;
import static org.junit.Assert.*;

public class MisleadingMethodNamesTest {

    @Test
    public void testShowBug() {
        MisleadingMethodNames instance = new MisleadingMethodNames();
        String result = instance.showBug(); // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
        
        // Expected output
        String expectedOutput = "tostring(): This is a misleading method name!\n" +
                                "hashcode(): 42\n" +
                                "equal(): false\n";
        
        // This assertion will fail, indicating the bug
        assertEquals(expectedOutput, result); // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    }
}