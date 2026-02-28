import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysThrowsTest {
    AlwaysThrows alwaysThrows = new AlwaysThrows();

    @Test
    public void testShowBug() {
        alwaysThrows.showBug();  // TRIGGER BUG: AlwaysThrows
    }
}