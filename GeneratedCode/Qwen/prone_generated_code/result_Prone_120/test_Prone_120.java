import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationBugDemoTest {

    @Test
    public void testShowBugTriggersNonRuntimeAnnotation() {
        AnnotationBugDemo demo = new AnnotationBugDemo();
        assertEquals("Annotation not found", demo.showBug()); // TRIGGER BUG: NonRuntimeAnnotation
    }
}