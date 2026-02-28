import org.junit.Test;
import static org.junit.Assert.*;

public class RegexStackOverflowDemoTest {

    @Test
    public void testShowBugWithLongInput() {
        RegexStackOverflowDemo demo = new RegexStackOverflowDemo();
        
        // This input is intentionally long to demonstrate the stack overflow
        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < 7000; i++) {
            inputBuilder.append("a");
        }
        String input = inputBuilder.toString();

        // This call may cause a stack overflow due to the bug in the regex
        demo.showBug(input); // TRIGGER BUG: Regular expressions should not overflow the stack
    }
}