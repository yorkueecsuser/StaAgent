import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        String[] result = bugExample.showBug();

        assertEquals("Expected result is not as expected", "/File|Name.txt", result[0]); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result is not as expected", "File_Name.txt", result[1]); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result is not as expected", "/File|Name.txt", result[2]); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result is not as expected", "/File|Name.txt", result[3]); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result is not as expected", "File_Name.txt", result[4]); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result is not as expected", "/File|Name.txt", result[5]); // TRIGGER BUG: Inappropriate regular expressions should not be used
    }
}