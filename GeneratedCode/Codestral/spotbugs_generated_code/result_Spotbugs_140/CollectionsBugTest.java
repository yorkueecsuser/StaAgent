import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CollectionsBugTest {
    @Test
    public void testShowBug() {
        List<Object> buggyList = new ArrayList<>();
        buggyList.add(buggyList); // TRIGGER BUG: DMI: Collections should not contain themselves
        CollectionsBug bug = new CollectionsBug();
        boolean result = bug.showBug(buggyList);
        assertFalse(result);
    }
}