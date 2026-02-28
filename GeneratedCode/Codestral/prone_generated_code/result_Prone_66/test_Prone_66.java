import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Hashtable;

public class HashtableContainsBugTest {
    @Test
    public void testShowBug() {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("one", 1);
        Object key = "one";
        HashtableContainsBug bug = new HashtableContainsBug();
        boolean result = bug.showBug(table, key);
        // TRIGGER BUG: HashtableContains
        assertFalse("Expected bug to trigger with key 'one'", result);
    }
}