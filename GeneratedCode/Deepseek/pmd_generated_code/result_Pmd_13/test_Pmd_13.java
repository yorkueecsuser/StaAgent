import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testFooNumber() { // TRIGGER BUG: AvoidFieldNameMatchingTypeName
        Foo f = new Foo();
        assertEquals(0, f.fooNumber);
    }
}