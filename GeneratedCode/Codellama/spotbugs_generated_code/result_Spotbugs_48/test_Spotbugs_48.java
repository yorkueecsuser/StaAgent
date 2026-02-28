import org.junit.Test;
import static org.junit.Assert.*;

public class RangeArrayIndexBugTest {
    @Test
    public void testBugTrigger() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // TRIGGER BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        System.out.println(list.get(3));
    }
}