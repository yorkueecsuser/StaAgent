import org.junit.Test;
import static org.junit.Assert.*;

public class FileSeparatorBugTest {

    @Test
    public void testShowBugWithWindowsPath() {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "C:\\Users\\Username\\Documents\\file.txt";
        String result = bugDemo.showBug(filePath); // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION) 
        assertEquals("C:,Users,Username,Documents,file.txt", result);
    }

    @Test
    public void testShowBugWithUnixPath() {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "/home/username/documents/file.txt";
        String result = bugDemo.showBug(filePath); // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION) 
        assertEquals("home,username,documents,file.txt", result);
    }
}