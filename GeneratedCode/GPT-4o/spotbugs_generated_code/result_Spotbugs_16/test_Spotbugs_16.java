import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationVisibilityBugTest {

    @Test
    public void testShowBug() {
        AnnotationVisibilityBug bugDemo = new AnnotationVisibilityBug();
        boolean annotationPresent = bugDemo.showBug(); // TRIGGER BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        // The test expects the annotation to be present, which should be true, but due to the bug, it will be false.
        assertTrue("Expected ExampleAnnotation to be present", annotationPresent);
    }
}