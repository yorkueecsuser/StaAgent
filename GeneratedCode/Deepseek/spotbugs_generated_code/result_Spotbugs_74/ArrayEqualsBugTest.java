import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualsBugTest {
    @Test
    public void testShowBug() {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        assertFalse(bug.showBug(array, str)); // TRIGGER BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }
}