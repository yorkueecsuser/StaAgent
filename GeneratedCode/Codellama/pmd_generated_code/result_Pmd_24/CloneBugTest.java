import org.junit.Test;
import static org.junit.Assert.*;

public class CloneBugTest {
    @Test
    public void testCloneMethodMustBePublic() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // TRIGGER BUG: CloneMethodMustBePublic
        List<Integer> clone = list.clone();
        assertNotNull(clone);
        assertEquals(list, clone);
    }

    @Test
    public void testShowBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // TRIGGER BUG: CloneMethodMustBePublic
        List<Integer> clone = list.clone();
        assertNotNull(clone);
        assertEquals(list, clone);
    }
}