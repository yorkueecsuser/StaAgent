import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssertionBugTest {
    @Test
    public void testSelfAssertionBug() {
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj); // TRIGGER BUG: SelfAssertion
    }
}