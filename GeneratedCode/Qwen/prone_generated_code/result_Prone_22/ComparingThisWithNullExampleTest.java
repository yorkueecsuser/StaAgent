import org.junit.Test;
import static org.junit.Assert.*;

public class ComparingThisWithNullExampleTest {

    @Test
    public void testShowBug() {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        assertFalse(example.showBug()); // TRIGGER BUG: ComparingThisWithNull
    }

    @Test
    public void testShowBug2() {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        assertTrue(example.showBug2()); // TRIGGER BUG: ComparingThisWithNull
    }
}