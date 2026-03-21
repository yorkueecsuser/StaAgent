import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class ImmutableOperationBugTest {
    @Test
    public void testShowBug() {
        BigDecimal expected = new BigDecimal(15);
        BigDecimal result = ImmutableOperationBug.showBug();
        assertNotEquals("The result should not be equal to 15", expected, result); // TRIGGER BUG: UselessOperationOnImmutable
    }
}