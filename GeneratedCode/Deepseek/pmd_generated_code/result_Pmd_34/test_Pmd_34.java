import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        foo.showBug(); // TRIGGER BUG: DoNotExtendJavaLangThrowable
    }
}