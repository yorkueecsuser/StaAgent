import org.junit.Test;
import static org.junit.Assert.*;

public class FileSeparatorBugTest {
    @Test
    public void showBugTest() {
        FileSeparatorBug buggyClass = new FileSeparatorBug();
        String input = "C:\\test\\path"; // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        String expectedOutput = "Match found";
        String actualOutput = buggyClass.showBug(input);
        assertEquals(expectedOutput, actualOutput);
    }
}