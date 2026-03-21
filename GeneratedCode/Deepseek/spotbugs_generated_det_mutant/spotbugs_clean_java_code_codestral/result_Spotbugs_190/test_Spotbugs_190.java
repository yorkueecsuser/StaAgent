import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyListTest {
    @Test
    public void testBuggyList() {
        BuggyList.addToBuggyList("Item 1");
        List<String> buggyList = BuggyList.showBug();
        // TRIGGER BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
        buggyList.add("Item 2");
        assertEquals(2, buggyList.size());
    }
}