import org.junit.Test;
import static org.junit.Assert.*;

public class BuggySortTest {
    @Test
    public void testBuggySort() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);

        // TRIGGER BUG: Incomparable
        assertTrue(list.get(0).equals("A")); // TRIGGER BUG: Incomparable
    }

    @Test
    public void testBuggySort2() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);

        // TRIGGER BUG: Incomparable
        assertTrue(list.get(0).equals("C")); // TRIGGER BUG: Incomparable
    }
}