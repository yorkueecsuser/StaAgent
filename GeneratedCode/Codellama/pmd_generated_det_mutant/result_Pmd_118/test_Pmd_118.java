import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

class UseArraysAsListTest {
    @Test
    public void testBuggyCode() {
        String[] names = {"Alice", "Bob", "Charlie"};
        List<String> list = UseArraysAsList.showBug(names);
        list.add("Dan"); // TRIGGER BUG: UseArraysAsList
    }

    @Test
    public void testShowBug() {
        String[] names = {"Alice", "Bob", "Charlie"};
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        list.add("Dan");
    }
}