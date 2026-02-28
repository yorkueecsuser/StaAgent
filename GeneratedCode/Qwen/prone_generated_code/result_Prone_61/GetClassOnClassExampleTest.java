import org.junit.Test;
import static org.junit.Assert.*;

public class GetClassOnClassExampleTest {

    @Test
    public void testShowBugTriggersBug() {
        GetClassOnClassExample example = new GetClassOnClassExample();
        assertEquals("java.lang.String", example.showBug(String.class)); // TRIGGER BUG: GetClassOnClass
    }
}