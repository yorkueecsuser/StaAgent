import org.junit.Test;
import static org.junit.Assert.*;

public class FormatStringBugExampleTest {

    @Test
    public void testShowBug() {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug(); // TRIGGER BUG: FormatStringAnnotation
    }
}