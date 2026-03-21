import org.junit.Test;
import static org.junit.Assert.*;

public class FileSeparatorBugTest {

    private FileSeparatorBug fileSeparatorBug = new FileSeparatorBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        String actual = fileSeparatorBug.showBug();
        assertNotEquals("C:/path/to/file", actual);
    }

    @Test
    public void testGetFilePath() {
        // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        String actual = fileSeparatorBug.getFilePath();
        assertNotEquals("C:/path/to/file", actual);
    }

    @Test
    public void testGetRegularExpression() {
        // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        String actual = fileSeparatorBug.getRegularExpression();
        assertNotEquals("^.*\\\\.*$", actual);
    }
}