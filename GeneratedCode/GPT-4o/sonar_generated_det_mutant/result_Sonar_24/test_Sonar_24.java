import org.junit.Test;
import static org.junit.Assert.*;

public class RecordBugDemoTest {

    @Test
    public void testShowBugDifferentNamesSameAge() {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        boolean result = RecordBugDemo.showBug(names1, 25, names2, 25);
        assertTrue("Persons with same names and age should be equal", result); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }

    @Test
    public void testShowBugDifferentNamesDifferentAge() {
        String[] names1 = {"Jane", "Doe"};
        String[] names2 = {"John", "Doe"};
        boolean result = RecordBugDemo.showBug(names1, 25, names2, 30);
        assertFalse("Persons with different names and ages should not be equal", result);
    }

    @Test
    public void testShowBugSameNamesDifferentAge() {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        boolean result = RecordBugDemo.showBug(names1, 25, names2, 30);
        assertFalse("Persons with same names and different ages should not be equal", result);
    }
}