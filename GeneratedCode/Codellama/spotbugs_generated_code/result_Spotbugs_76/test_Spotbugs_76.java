import org.junit.Test;
import static org.junit.Assert.*;

public class UnrelatedInterfacesBugTest {
    @Test
    public void testBug() {
        UnrelatedInterfacesBug.Foo foo = new UnrelatedInterfacesBug.FooBar();
        UnrelatedInterfacesBug.Bar bar = new UnrelatedInterfacesBug.FooBar();
        boolean result = foo.isFoo() && bar.isBar();// TRIGGER BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        assertFalse(result);
    }
}