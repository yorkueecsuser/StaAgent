import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ImmutableBugExampleTest {

    @Test
    public void testShowBug1() {
        ImmutableBugExample example = new ImmutableBugExample();
        String result = example.showBug1("hello"); // TRIGGER BUG: UselessOperationOnImmutable
        assertEquals("HELLO", result); // This will pass, but the bug is in the method itself
    }

    @Test
    public void testShowBug2() {
        ImmutableBugExample example = new ImmutableBugExample();
        BigDecimal result = example.showBug2(new BigDecimal("10")); // TRIGGER BUG: UselessOperationOnImmutable
        assertEquals(new BigDecimal("10"), result); // This will pass, but the bug is in the method itself
    }

    @Test
    public void testShowBug3() {
        ImmutableBugExample example = new ImmutableBugExample();
        LocalDate result = example.showBug3(LocalDate.now()); // TRIGGER BUG: UselessOperationOnImmutable
        assertEquals(LocalDate.now(), result); // This will likely fail because the date is not incremented
    }
}