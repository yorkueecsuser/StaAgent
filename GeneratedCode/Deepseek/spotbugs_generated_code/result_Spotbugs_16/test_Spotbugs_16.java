import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;

public class AnnotationBugTest {
    @Test
    public void showBugTest() {
        AnnotationBug.showBug(); // Calls the buggy method
        // TRIGGER BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        try {
            Method method = AnnotationBug.class.getMethod("showBug");
            boolean isAnnotationPresent = method.isAnnotationPresent(CustomAnnotation.MyAnnotation.class);
            assertTrue("MyAnnotation should be present", isAnnotationPresent); // This will fail as the annotation is not visible to reflection at runtime
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}