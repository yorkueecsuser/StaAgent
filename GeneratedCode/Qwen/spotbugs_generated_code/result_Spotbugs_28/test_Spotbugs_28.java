import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleClassTest {

    @Test
    public void testShowBugWithEqualObjects() {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = new ExampleClass(10);
        assertEquals(1, obj1.showBug(obj1, obj2)); // TRIGGER BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    }

    @Test
    public void testShowBugWithDifferentObjects() {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj3 = new ExampleClass(20);
        assertEquals(0, obj1.showBug(obj1, obj3)); // TRIGGER BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    }
}