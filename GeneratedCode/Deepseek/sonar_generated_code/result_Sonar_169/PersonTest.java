import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    @Test
    // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    public void testEqualsMethod() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        assertNotEquals(p1, p2); // This will fail and trigger the bug
    }
}