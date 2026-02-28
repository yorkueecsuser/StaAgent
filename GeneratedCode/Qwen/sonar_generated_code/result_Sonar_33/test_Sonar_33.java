import org.junit.Test;
import static org.junit.Assert.*;

public class RegexStackOverflowExampleTest {

    @Test
    public void testShowBugWithLargeInput() {
        RegexStackOverflowExample example = new RegexStackOverflowExample();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6000; i++) {
            sb.append("a");
        }
        example.showBug(sb.toString()); // TRIGGER BUG: Regular expressions should not overflow the stack
    }
}