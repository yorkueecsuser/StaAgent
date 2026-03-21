import org.junit.Test;
import static org.junit.Assert.*;

public class UnreachableCodeExampleTest {

    @Test
    public void testShowBug1() {
        UnreachableCodeExample example = new UnreachableCodeExample();
        example.showBug1(true); // TRIGGER BUG: Conditionally executed code should be reachable
        // Since the condition is always false, the bug is triggered by the unreachable code.
    }

    @Test
    public void testShowBug2() {
        UnreachableCodeExample example = new UnreachableCodeExample();
        String result = example.showBug2(false); // TRIGGER BUG: Conditionally executed code should be reachable
        assertEquals("Doing something else", result);
        // The assert will fail because the else block is never executed due to the bug.
    }
}