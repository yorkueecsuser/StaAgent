import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugTest {
    @Test
    public void testNullPointerBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(null);

        for (String str : list) {
            System.out.println(str.toUpperCase()); // TRIGGER BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    }
}