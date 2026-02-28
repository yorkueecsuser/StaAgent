import org.junit.Test;
import static org.junit.Assert.*;

public class BarTest {
    // TRIGGER BUG: ComparableType
    @Test(expected = ClassCastException.class)
    public void testCompareToWithWrongType() {
        Bar bar = new Bar(10);
        Foo foo = new Foo(10);
        bar.compareTo(foo); // This line triggers the bug
    }
}