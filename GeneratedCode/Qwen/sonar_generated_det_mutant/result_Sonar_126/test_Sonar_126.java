import org.junit.Test;
import java.util.Date;

public class ChildTest {

    @Test
    public void testShowBug() {
        Child child = new Child();
        child.showBug(new Date()); // TRIGGER BUG: Child class methods named for parent class methods should be overrides
    }
}