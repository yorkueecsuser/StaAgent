import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationReflectionBugTest {

    @Test
    public void testShowBug() {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        assertTrue(bugDemo.showBug()); // TRIGGER BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
    }
}