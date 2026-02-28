import org.junit.Test;
import static org.junit.Assert.*;

public class CloneableExampleTest {

    @Test
    public void testShowBug() throws CloneNotSupportedException {
        CloneableExample example = new CloneableExample();
        Object clone = example.showBug(); // TRIGGER BUG: CloneMethodReturnTypeMustMatchClassName
        assertTrue(clone instanceof CloneableExample); // This assertion will fail due to the bug
    }
}