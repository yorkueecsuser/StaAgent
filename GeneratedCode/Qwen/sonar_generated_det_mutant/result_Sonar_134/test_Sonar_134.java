import org.junit.Test;
import static org.junit.Assert.*;

public class BoxingUnboxingExampleTest {

    @Test
    public void testShowBug1() {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        int result = example.showBug1(); // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
        assertEquals(1, result); // This assertion will fail, triggering the bug
    }
}