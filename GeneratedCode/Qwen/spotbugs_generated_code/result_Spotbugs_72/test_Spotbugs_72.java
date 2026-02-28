import org.junit.Test;
import static org.junit.Assert.*;

class PointerEqualityBug {

    public boolean showBug(String str, Integer num) {
        return str == num; // TRIGGER BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY) 
    }

    public static void main(String[] args) {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        System.out.println(bugDemo.showBug("Hello", 10));
    }
}

public class PointerEqualityBugTest {

    @Test
    public void testShowBugWithDifferentTypes() {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        assertFalse(bugDemo.showBug("Hello", 10)); // TRIGGER BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY) 
    }

    @Test
    public void testShowBugWithSameStringAndInteger() {
        PointerEqualityBug bugDemo = new PointerEqualityBug();
        assertFalse(bugDemo.showBug("10", 10)); // TRIGGER BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY) 
    }
}