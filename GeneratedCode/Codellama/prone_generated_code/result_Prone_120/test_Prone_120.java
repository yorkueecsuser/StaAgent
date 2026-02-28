import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationBugTest {
    @Test
    public void testGetAnnotationWithNonRuntimeAnnotation() {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        // TRIGGER BUG: NonRuntimeAnnotation
        assertNull(annotation);
    }
}