import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testEqualsWithDifferentType() {
        MyClass obj1 = new MyClass(1, "Object 1");
        String obj2 = "Not a MyClass object";
        
        // TRIGGER BUG: "equals(Object obj)" should test the argument's type
        boolean result = obj1.showBug(obj2); // This line triggers the bug
        assertFalse(result);
    }

    @Test
    public void testEqualsWithSameTypeDifferentValue() {
        MyClass obj1 = new MyClass(1, "Object 1");
        MyClass obj2 = new MyClass(2, "Object 2");
        
        boolean result = obj1.showBug(obj2);
        assertFalse(result);
    }

    @Test
    public void testEqualsWithSameTypeSameValue() {
        MyClass obj1 = new MyClass(1, "Object 1");
        MyClass obj2 = new MyClass(1, "Object 1");
        
        boolean result = obj1.showBug(obj2);
        assertTrue(result);
    }
}