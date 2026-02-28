import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class HashCodeBugExampleTest {

    @Test
    public void testShowBug() {
        HashCodeBugExample example = new HashCodeBugExample(1);
        assertEquals(1, example.showBug()); // TRIGGER BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    }

    @Test
    public void testShowBugWithDifferentInstance() {
        HashCodeBugExample example1 = new HashCodeBugExample(1);
        HashCodeBugExample example2 = new HashCodeBugExample(1);
        Map<HashCodeBugExample, String> map = new HashMap<>();
        map.put(example1, "Example1");
        map.put(example2, "Example2");
        assertEquals(2, map.size()); // TRIGGER BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    }
}