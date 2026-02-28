import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientEmptyStringCheckTest {
    @Test
    public void testShowBug() {
        InefficientEmptyStringCheck obj = new InefficientEmptyStringCheck();
        String str = "   ";
        assertTrue(obj.showBug(str)); // TRIGGER BUG: InefficientEmptyStringCheck
    }
}