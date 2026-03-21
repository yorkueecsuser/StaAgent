import org.junit.Test;
import static org.junit.Assert.*;

public class InappropriateRegexBugTest {
    @Test
    public void testShowBug() {
        InappropriateRegexBug bugInstance = new InappropriateRegexBug();
        String testString = "/File|Name.txt";
        String expected = ""; // Buggy: Expecting an empty string but the result should be "/File_Name_txt"
        assertEquals(expected, bugInstance.showBug(testString)); // TRIGGER BUG: Inappropriate regular expressions should not be used
    }
}