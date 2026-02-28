import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferBugExampleTest {

    @Test
    public void testShowBug1() {
        StringBufferBugExample example = new StringBufferBugExample();
        int capacity = example.showBug1(); // TRIGGER BUG: StringBufferInstantiationWithChar
        assertEquals(17, capacity); // This will fail because the actual capacity is 99
    }

    @Test
    public void testShowBug2() {
        StringBufferBugExample example = new StringBufferBugExample();
        int capacity = example.showBug2(); // TRIGGER BUG: StringBufferInstantiationWithChar
        assertEquals(17, capacity); // This will fail because the actual capacity is 99
    }
}