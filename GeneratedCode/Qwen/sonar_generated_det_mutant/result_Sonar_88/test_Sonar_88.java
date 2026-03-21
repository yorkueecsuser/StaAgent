import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionToArrayBugTest {

    @Test(expected = ClassCastException.class)
    public void testShowBugTriggersClassCastException() {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        String[] result = bugDemo.showBug(stringList); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
    }
}