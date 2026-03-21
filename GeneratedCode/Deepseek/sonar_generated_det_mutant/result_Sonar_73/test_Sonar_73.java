import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {

    @Test
    public void testShowBug() {
        Child child = new Child();
        child.showBug();
        // TRIGGER BUG: Overrides should match their parent class methods in synchronization
    }
}