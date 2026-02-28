import org.junit.Test;
import static org.junit.Assert.*;

public class OuterClassTest {

    @Test
    public void testShowBugWithNullInnerClass() {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = null;
        outer.showBug(inner); // TRIGGER BUG: NullableOnContainingClass
    }

    @Test
    public void testShowBugWithNonNullInnerClass() {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        outer.showBug(inner); // This should pass and not trigger the bug
    }

    @Test
    public void testShowBugStaticWithNullStaticInnerClass() {
        OuterClass outer = new OuterClass();
        OuterClass.StaticInnerClass staticInner = null;
        outer.showBugStatic(staticInner); // TRIGGER BUG: NullableOnContainingClass
    }

    @Test
    public void testShowBugStaticWithNonNullStaticInnerClass() {
        OuterClass outer = new OuterClass();
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        outer.showBugStatic(staticInner); // This should pass and not trigger the bug
    }
}