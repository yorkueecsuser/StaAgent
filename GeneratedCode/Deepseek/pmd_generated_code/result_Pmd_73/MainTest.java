import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: StringBufferInstantiationWithChar
    public void testShowBug() {
        Main.showBug();
    }
}