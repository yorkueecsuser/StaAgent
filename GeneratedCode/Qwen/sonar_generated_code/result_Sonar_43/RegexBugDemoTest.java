import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugDemoTest {

    @Test
    public void testShowBug() {
        RegexBugDemo demo = new RegexBugDemo();
        // The following line triggers the bug by calling the showBug method which contains an invalid regex
        String result = demo.showBug(); // TRIGGER BUG: Regular expressions should be syntactically valid
        assertEquals("Unclosed group near index 1\n([", result);
    }
}