import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testShowBug() {
        Demo demo = new Demo();
        demo.showBug(); // TRIGGER BUG: AvoidEnumAsIdentifier
    }
}