import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testEquals() {
        MyClass myClass1 = new MyClass(10);
        MyClass myClass2 = new MyClass(20);
        assertFalse(myClass1.equals(myClass2)); // Test with different instances

        String string = "Not a MyClass instance";
        assertFalse(myClass1.equals(string)); // Test with a non-MyClass instance // TRIGGER BUG: "equals(Object obj)" should test the argument's type
    }
}