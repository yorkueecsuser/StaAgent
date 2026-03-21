import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class MustBeClosedCheckerExampleTest {

    @Test
    public void testShowBug() throws IOException {
        MustBeClosedCheckerExample example = new MustBeClosedCheckerExample();
        String content = example.showBug("test.txt"); // TRIGGER BUG: MustBeClosedChecker
        assertNotNull(content);
    }
}