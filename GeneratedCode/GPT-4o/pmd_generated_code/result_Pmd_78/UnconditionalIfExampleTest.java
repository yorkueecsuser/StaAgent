import org.junit.Test;
import static org.junit.Assert.*;

public class UnconditionalIfExampleTest {

    @Test
    public void testShowBug() {
        UnconditionalIfExample example = new UnconditionalIfExample();
        String result = example.showBug(true); // TRIGGER BUG: UnconditionalIfStatement
        assertEquals("This will always execute because the condition is always true", result); // TRIGGER BUG: UnconditionalIfStatement
    }

    @Test
    public void testShowBug2() {
        UnconditionalIfExample example = new UnconditionalIfExample();
        String result = example.showBug2(true); // TRIGGER BUG: UnconditionalIfStatement
        assertEquals("This will never execute because the condition is always false", result); // TRIGGER BUG: UnconditionalIfStatement
    }
}