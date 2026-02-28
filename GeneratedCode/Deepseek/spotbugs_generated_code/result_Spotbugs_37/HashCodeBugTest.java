import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeBugTest {
    @Test
    public void testHashCodeBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");

        // TRIGGER BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        assertNotEquals("The hashCode() method is not overridden, resulting in the same hashcode for different objects", obj1.hashcode(), obj2.hashcode());
    }
}