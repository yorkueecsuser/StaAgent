import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;

public class RegexFileSeparatorBugExampleTest {

    @Test
    public void testShowBugWithWindowsPaths() {
        RegexFileSeparatorBugExample example = new RegexFileSeparatorBugExample();
        String[] paths = {"C:\\Users\\User", "D:\\Docs\\Files"};
        String[] expected = {"C:/Users/User", "D:/Docs/Files"};
        
        // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        String[] results = example.showBug(paths);

        assertArrayEquals(expected, results);
    }

    @Test
    public void testShowBugWithMixedPaths() {
        RegexFileSeparatorBugExample example = new RegexFileSeparatorBugExample();
        String[] paths = {"C:\\Users\\User", "D:/Docs/Files"};
        String[] expected = {"C:/Users/User", "D:/Docs/Files"};
        
        // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        String[] results = example.showBug(paths);

        assertArrayEquals(expected, results);
    }
}