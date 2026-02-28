import org.junit.Test;
import static org.junit.Assert.*;

public class MissingSuperCallExampleTest {

    @Test
    public void testShowBug() {
        MissingSuperCallExample example = new MissingSuperCallExample();
        String result = example.showBug(); // TRIGGER BUG: MissingSuperCall
        assertEquals("BaseClass process method should be called first.",
                     "BaseClass process method called\nMissingSuperCallExample process method called", result);
    }
}