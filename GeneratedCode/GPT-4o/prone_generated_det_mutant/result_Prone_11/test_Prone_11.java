import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationBugDemoTest {

    @Test
    public void testShowBug() {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        assertFalse(demo.showBug()); // TRIGGER BUG: BadAnnotationImplementation
    }
}