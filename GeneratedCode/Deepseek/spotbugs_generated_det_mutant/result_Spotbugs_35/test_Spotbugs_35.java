import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    private class A {
        public int f(Foo x) { return 17; }
    }

    private class B extends A {
        public int f(Foo x) { return 42; } // BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
    }

    private class Foo {
        // Additional code just to make the compiler happy
    }

    @Test
    public void testMethodOverride() {
        B b = new B();
        A a = new A();
        Foo foo = new Foo();

        assertEquals(b.f(foo), 42); // This assertion should fail
    }
}