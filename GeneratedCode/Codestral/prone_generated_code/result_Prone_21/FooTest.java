import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testBug() {
        Foo foo = new Foo(5);
        Bar bar = new Bar(10);
        foo.showBug(bar); // TRIGGER BUG: ComparableType
    }
}