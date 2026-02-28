import org.junit.Test;
import static org.junit.Assert.*;

public class FormatStringBugExampleTest {

    @Test
    public void testShowBug() {
        FormatStringBugExample example = new FormatStringBugExample();
        // This line is designed to trigger the FormatString bug
        example.showBug(); // TRIGGER BUG: FormatString
    }
}