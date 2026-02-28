import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationBugExampleTest {

    @Test
    public void testShowBug() {
        AnnotationBugExample example = new AnnotationBugExample();
        String result = example.showBug(); // TRIGGER BUG: NonRuntimeAnnotation
        assertNotNull("The annotation should not be null", result); // TRIGGER BUG: NonRuntimeAnnotation
        assertEquals("Annotation is present", result);
    }
}