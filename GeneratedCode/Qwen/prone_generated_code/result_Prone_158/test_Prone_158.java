import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class DeprecatedExampleTest {

    @Test
    public void testShowBug() {
        DeprecatedExample example = new DeprecatedExample();
        Date date = example.showBug(); // TRIGGER BUG: SuppressWarningsDeprecated
        assertNotNull(date);
    }
}