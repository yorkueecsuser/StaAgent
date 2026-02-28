import org.junit.Test;
import static org.junit.Assert.*;

public class CompareObjectsWithEqualsTest {
    @Test
    public void testCompareObjectsWithEquals() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        
        // TRIGGER BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}