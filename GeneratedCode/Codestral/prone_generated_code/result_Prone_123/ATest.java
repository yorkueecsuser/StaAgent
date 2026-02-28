import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    @Test
    public void testShowBug() {
        A a = new A();
        // TRIGGER BUG: NullableOnContainingClass. Expected compilation error as '@Nullable' should be placed on the inner class 'B' instead of the outer class 'A'.
        a.showBug(null);
    }
}