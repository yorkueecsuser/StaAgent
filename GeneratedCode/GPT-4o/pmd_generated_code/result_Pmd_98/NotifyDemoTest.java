import org.junit.Test;
import static org.junit.Assert.*;

public class NotifyDemoTest {

    @Test
    public void testShowBug() {
        NotifyDemo demo = new NotifyDemo();
        demo.showBug(); // TRIGGER BUG: UseNotifyAllInsteadOfNotify
    }
}