import org.junit.Test;
import static org.junit.Assert.*;

public class RegexExampleTest {

    @Test
    public void testShowBugWithInvalidPattern() {
        RegexExample example = new RegexExample();
        example.showBug("example"); // TRIGGER BUG: InvalidPatternSyntax
    }
}