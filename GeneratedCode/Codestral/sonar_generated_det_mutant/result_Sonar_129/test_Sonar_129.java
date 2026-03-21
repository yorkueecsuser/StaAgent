import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyComparableClassTest {

    @Test
    public void testCompareToLessThan() {
        BuggyComparableClass obj1 = new BuggyComparableClass(1);
        BuggyComparableClass obj2 = new BuggyComparableClass(2);
        assertEquals("compareTo should not return Integer.MIN_VALUE", -1, obj1.showBug(obj2)); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
    }

    @Test
    public void testCompareToGreaterThan() {
        BuggyComparableClass obj1 = new BuggyComparableClass(3);
        BuggyComparableClass obj2 = new BuggyComparableClass(2);
        assertEquals("compareTo should not return Integer.MAX_VALUE", 1, obj1.showBug(obj2)); // TRIGGER BUG: "compareTo" should not return "Integer.MAX_VALUE"
    }
}