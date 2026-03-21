import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testBuggyFoo() {
        Foo foo = new Foo();
        foo.showBug(); // TRIGGER BUG: AvoidSynchronizedStatement
        // The bug is triggered because the buggyFoo method uses the'synchronized' keyword,
        // which can cause performance problems in multi-threaded applications.
    }
}