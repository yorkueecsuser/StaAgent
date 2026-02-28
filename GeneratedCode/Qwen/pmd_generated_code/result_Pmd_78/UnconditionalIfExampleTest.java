import org.junit.Test;
import static org.junit.Assert.*;

public class UnconditionalIfExampleTest {

    @Test
    public void testShowBug() {
        UnconditionalIfExample example = new UnconditionalIfExample();
        String result = example.showBug(); // TRIGGER BUG: UnconditionalIfStatement
        assertEquals("This is a bug", result);
    }
}