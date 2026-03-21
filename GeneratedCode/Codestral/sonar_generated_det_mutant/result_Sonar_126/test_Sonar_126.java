import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {

    @Test
    public void testShowBug() {
        Parent parent = new Parent();
        parent.showBug(); // TRIGGER BUG: Child class methods named for parent class methods should be overrides
    }
}