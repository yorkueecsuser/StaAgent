import org.junit.Test;
import static org.junit.Assert.*;

public class RegexStackOverflowTest {

    @Test
    public void testShowBugTriggersStackOverflow() {
        RegexStackOverflow demo = new RegexStackOverflow();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6000; i++) {
            sb.append("a");
        }
        demo.showBug(sb.toString()); // TRIGGER BUG: Regular expressions should not overflow the stack
    }
}