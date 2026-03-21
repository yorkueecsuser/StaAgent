import org.junit.Test;
import static org.junit.Assert.*;

public class SubClassTest {
    @Test
    public void testBug() {
        SubClass obj1 = new SubClass();
        SuperClass obj2 = new SuperClass();
        
        // This should fail, triggering the bug
        // TRIGGER LINE: 11
        assertEquals(obj2.equals(obj1), obj1.equals(obj2));
    }
}