import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionToArrayBugTest {

    @Test(expected = ClassCastException.class)
    public void testShowBug() {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        String[] result = bugDemo.showBug(stringList); // TRIGGER BUG: CollectionToArraySafeParameter
    }
}