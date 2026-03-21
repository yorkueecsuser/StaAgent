import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {

    @Test
    public void testShowBug() {
        Child child = new Child();
        String result = child.showBug(); // TRIGGER BUG: Child class methods named for parent class methods should be overrides
        assertNotNull(result);
    }
}