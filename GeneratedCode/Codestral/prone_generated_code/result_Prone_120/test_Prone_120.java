import org.junit.Test;
import static org.junit.Assert.*;

public class NonRuntimeAnnotationBugTest {

    @Test
    public void testShowBug() {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();  // TRIGGER BUG: NonRuntimeAnnotation
        assertNotNull("Annotation should not be null", bug.getClass().getAnnotation(NonRuntimeAnnotation.class));
    }
}