import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionAnnotationBugTest {
    @Test
    public void testCheckAnnotation() {
        ReflectionAnnotationBug buggyClass = new ReflectionAnnotationBug();
        // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
        assertFalse(buggyClass.showBug());
    }
}