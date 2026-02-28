import org.junit.Test;
import static org.junit.Assert.*;

public class DoNotMockBugTest {

    @Test
    // TRIGGER BUG: DoNotMock
    public void testShowBug() {
        DoNotMockBug.showBug();
    }
}