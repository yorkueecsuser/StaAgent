import org.junit.Test;
import static org.junit.Assert.*;

public class NonStaticInitializerBugTest {
    @Test
    public void testBug() {
        NonStaticInitializerBug bug = new NonStaticInitializerBug(5, 10);
        bug.showBug();
        // TRIGGER BUG: NonStaticInitializer
    }
}