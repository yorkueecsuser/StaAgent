import org.junit.Test;
import static org.junit.Assert.*;

class IsInstanceIncompatibleTypeBugExampleTest {
    @Test
    public void testBug() {
        Object obj = new Object();
        if (obj instanceof String) {
            System.out.println("This is a string");
        } else {
            System.out.println("This is not a string");
        }
        // TRIGGER BUG: IsInstanceIncompatibleType
    }
}