import org.junit.Test;
import static org.junit.Assert.*;

public class GetClassOnClassBugTest {

    @Test
    public void testShowBug() {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        Class<?> cls = String.class;
        // TRIGGER BUG: GetClassOnClass
        assertNotEquals(cls, cls.getClass());
    }
}