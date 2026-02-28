import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class CollectionToArraySafeParameterBugTest {
    @Test
    public void testBugTrigger() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(array);

        String[] expected = new String[]{"a", "b", "c"};
        assertArrayEquals(expected, array); // TRIGGER BUG: CollectionToArraySafeParameter
    }
}