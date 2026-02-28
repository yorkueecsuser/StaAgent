// Test Code After Fixes
import org.junit.Test;
import static org.junit.Assert.*;

public class BTest {
    @Test
    public void testShowBug() {
        B b = new B();
        Foo foo = new Foo();
        int result = b.showBug(); // TRIGGER BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
        assertEquals("The method 'f(Foo x)' defined in class B doesn't override the 'f(Foo x)' method defined in class A, because the argument types are Foo's from different packages.", 17, result);
    }
}