import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test // TRIGGER BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
    public void testShowBug() {
        MyClass myObject = new MyClass();
        assertTrue(myObject.showBug()); // This should fail due to the bug in the equals() method
    }
}