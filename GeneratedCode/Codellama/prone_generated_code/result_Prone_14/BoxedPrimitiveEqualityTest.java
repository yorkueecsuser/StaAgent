import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveEqualityTest {
    @Test
    public void testBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // TRIGGER BUG: BoxedPrimitiveEquality
        // This comparison is using reference equality instead of value equality
        if (list.get(0) == list.get(3)) {
            System.out.println("Bug found!");
        }
    }
}