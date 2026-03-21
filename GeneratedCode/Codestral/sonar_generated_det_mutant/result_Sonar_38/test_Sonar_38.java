import org.junit.Test;
import static org.junit.Assert.*;

public class BadCodeTest {
    @Test
    public void testCalculateSumWithNegativeNumbers() {
        BadCode badCode = new BadCode();
        badCode.showBug(); // TRIGGER BUG: Assertions should not be used in production code
    }
}