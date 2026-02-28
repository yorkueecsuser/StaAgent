import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    @Test
    public void testBug() {
        A a = new A();
        a.test(new A.B()); // TRIGGER BUG: NullableOnContainingClass
    }
}