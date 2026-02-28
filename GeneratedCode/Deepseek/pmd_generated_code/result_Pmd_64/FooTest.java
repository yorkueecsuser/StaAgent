import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testOverrideBothEqualsAndHashcode() {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        // TRIGGER BUG: OverrideBothEqualsAndHashcode
        foo1.showBug();
    }
}