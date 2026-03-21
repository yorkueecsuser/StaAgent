import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testEqualsWithDifferentType() {
        MyClass myClass = new MyClass(5);
        String str = "Hello";
        assertFalse(myClass.showBug(str)); // TRIGGER BUG: "equals(Object obj)" should test the argument's type
    }
}