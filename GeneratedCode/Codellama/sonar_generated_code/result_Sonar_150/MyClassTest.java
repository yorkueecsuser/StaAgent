import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testEquals() {
        MyClass myClass = new MyClass(1, "John");
        // TRIGGER BUG: "equals(Object obj)" should test the argument's type
        assertFalse(myClass.equals("John"));
    }

    @Test
    public void testEqualsWithDifferentType() {
        MyClass myClass = new MyClass(1, "John");
        // TRIGGER BUG: "equals(Object obj)" should test the argument's type
        assertFalse(myClass.equals(new Object()));
    }
}