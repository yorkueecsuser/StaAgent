import org.junit.Test;
import static org.junit.Assert.*;

public class SpringBugExampleTest {
    @Test
    public void testShowBug() {
        SpringBugExample example = new SpringBugExample();
        try {
            example.showBug();
            fail("showBug() should throw an exception");
        } catch (Exception e) {
            assertEquals("java.lang.IllegalArgumentException", e.getClass().getSimpleName());
            assertEquals("Methods with Spring proxying annotations should be public", e.getMessage());
        }
    }
}