import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidThreadGroupTest {
    @Test
    public void testShowBug() {
        AvoidThreadGroup avoidThreadGroup = new AvoidThreadGroup();
        avoidThreadGroup.showBug(); // TRIGGER BUG: AvoidThreadGroup
    }
}