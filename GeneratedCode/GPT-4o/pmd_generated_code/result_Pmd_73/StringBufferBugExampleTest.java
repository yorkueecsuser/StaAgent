import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferBugExampleTest {

    @Test
    public void testShowBug1() {
        StringBufferBugExample example = new StringBufferBugExample();
        int capacity = example.showBug1(); // TRIGGER BUG: StringBufferInstantiationWithChar
        // Expecting default capacity of StringBuffer with String "c", which is 17, but due to the bug it will be 99
        assertEquals(17, capacity);
    }

    @Test
    public void testShowBug2() {
        StringBufferBugExample example = new StringBufferBugExample();
        int capacity = example.showBug2(); // TRIGGER BUG: StringBufferInstantiationWithChar
        // Expecting default capacity of StringBuilder with String "c", which is 17, but due to the bug it will be 99
        assertEquals(17, capacity);
    }

    @Test
    public void testShowBug3() {
        StringBufferBugExample example = new StringBufferBugExample();
        int capacity = example.showBug3();
        // Expecting default capacity of StringBuffer with String "c", which is 17
        assertEquals(17, capacity);
    }

    @Test
    public void testShowBug4() {
        StringBufferBugExample example = new StringBufferBugExample();
        int capacity = example.showBug4();
        // Expecting default capacity of StringBuilder with String "c", which is 17
        assertEquals(17, capacity);
    }
}