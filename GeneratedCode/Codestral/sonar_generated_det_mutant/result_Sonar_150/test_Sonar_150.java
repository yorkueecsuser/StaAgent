import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testEqualsMethodWithDifferentType() {
        MyClass m1 = new MyClass("hello");
        // TRIGGER BUG: "equals(Object obj)" should test the argument's type
        m1.showBug();
    }
}