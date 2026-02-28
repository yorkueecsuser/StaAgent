import org.junit.Test;
import static org.junit.Assert.*;

class NullableOnContainingClassExample {

    @Target(ElementType.TYPE_USE)
    @interface Nullable {}

    class InnerClass {}

    static class StaticInnerClass {}

    void testMethod(InnerClass x) {} // Correct usage

    void testMethodRenamed(StaticInnerClass x) {} // Renamed to avoid conflict

    void testMethod(@Nullable InnerClass x) {} // BUG: NullableOnContainingClass

    public InnerClass showBug() {
        return new InnerClass(); // This method demonstrates the bug by incorrectly annotating the outer class
    }

    public static void main(String[] args) {
        NullableOnContainingClassExample example = new NullableOnContainingClassExample();
        InnerClass inner = example.showBug();
        System.out.println(inner);
    }
}

public class NullableOnContainingClassExampleTest {

    @Test
    public void testShowBug() {
        NullableOnContainingClassExample example = new NullableOnContainingClassExample();
        NullableOnContainingClassExample.InnerClass inner = example.showBug(); // TRIGGER BUG: NullableOnContainingClass
        assertNotNull(inner); // This assertion will pass, but the bug is in the method signature
    }
}