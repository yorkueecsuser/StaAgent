import org.junit.Test;
import static org.junit.Assert.*;

class BoxUnboxExampleTest {

    @Test
    public void testShowBug() {
        BoxUnboxExample example = new BoxUnboxExample();
        int result = example.showBug(); // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
        assertEquals(1, result); // This assertion will fail, triggering the bug
    }
}