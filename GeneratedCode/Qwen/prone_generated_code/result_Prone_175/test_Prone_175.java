import org.junit.Test;
import static org.junit.Assert.*;

public class OneOfExampleTest {

    @Test
    public void testShowBugWithFoo() {
        OneOfExample example = new OneOfExample();
        OneOfExample.FooBar fooBar = new OneOfExample.FooBar(OneOfExample.BlahCase.FOO, "Hello", 0);
        assertEquals("Hello", example.showBug(fooBar));
    }

    @Test
    public void testShowBugWithBar() {
        OneOfExample example = new OneOfExample();
        OneOfExample.FooBar fooBar = new OneOfExample.FooBar(OneOfExample.BlahCase.BAR, "", 42);
        assertEquals("42", example.showBug(fooBar)); // TRIGGER BUG: WrongOneof
    }
}