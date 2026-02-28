import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Set;

public class InterfaceComparisonBugTest {

    @Test
    public void testShowBugWithListAndSet() {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        assertFalse(bugDemo.showBug(myList, mySet)); // TRIGGER BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES) 
    }
}