import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class ImmutableOperationExampleTest {

    @Test
    public void testShowBug() {
        ImmutableOperationExample example = new ImmutableOperationExample();
        BigDecimal result = example.showBug(10, 5); // TRIGGER BUG: UselessOperationOnImmutable
        assertEquals("The result should be the same as the initial value due to the bug", new BigDecimal(10), result);
    }
}