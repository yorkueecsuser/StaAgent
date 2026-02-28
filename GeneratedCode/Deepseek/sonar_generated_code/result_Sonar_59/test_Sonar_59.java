import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testBug() {
        Foo foo = new Foo();
        int[] result = foo.showBug();
        assertNotEquals(0, result[0]); // TRIGGER BUG: "compareTo" should not be overloaded
        assertNotEquals(0, result[1]); // TRIGGER BUG: "compareTo" should not be overloaded
    }
}