import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationReflectionBugTest {

    @Test
    public void testShowBug() {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        assertFalse(bugDemo.showBug()); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
    }
}