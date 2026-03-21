import org.junit.Test;
import static org.junit.Assert.*;

public class ChildClassTest {
    @Test
    public void testShowBug() {
        ChildClass child = new ChildClass();
        int[] expected = {4, 5, 6};
        int[] actual = child.showBug();
        assertArrayEquals(expected, actual); // TRIGGER BUG: MissingSuperCall
    }
}