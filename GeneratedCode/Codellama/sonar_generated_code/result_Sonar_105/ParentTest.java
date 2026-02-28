import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {
    @Test
    public void showBug() {
        // TRIGGER BUG: Classes should not access their own subclasses during class initialization
        System.out.println(Parent.field1); // will display "0" instead of "42"
    }
}