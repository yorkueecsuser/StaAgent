import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleInstanceofExampleTest {

    @Test
    public void testShowBug() {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        assertEquals("true", example.showBug()); // TRIGGER BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
    }
}