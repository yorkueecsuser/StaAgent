import org.junit.Test;
import static org.junit.Assert.*;

public class MoreThanOneInjectableConstructorTest {
    @Test
    public void testShowBug() throws Exception {
        MoreThanOneInjectableConstructor obj = new MoreThanOneInjectableConstructor();
        try {
            obj.showBug();
            fail("Expected an Exception to be thrown");
        } catch (Exception ex) {
            assertTrue(ex.getMessage().contains("BUG: MoreThanOneInjectableConstructor"));
        }
    }
}