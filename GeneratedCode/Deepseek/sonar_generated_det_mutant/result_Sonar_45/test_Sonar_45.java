import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    private Main main = new Main();

    @Test
    public void testShowBug() {
        main.showBug();    // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}