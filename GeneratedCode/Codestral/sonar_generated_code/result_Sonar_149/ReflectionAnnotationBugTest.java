import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;

public class ReflectionAnnotationBugTest {

    @Test
    public void testShowBug() {
        ReflectionAnnotationBug bug = new ReflectionAnnotationBug();
        try {
            Method method = bug.getClass().getMethod("sourceAnnotatedMethod"); // Get the sourceAnnotatedMethod
            if (method.isAnnotationPresent(ReflectionAnnotationBug.SourceAnnotation.class)) { // Noncompliant, bug
                fail("@SourceAnnotation should not be present"); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
            }
        } catch (NoSuchMethodException e) {
            fail("Method not found: sourceAnnotatedMethod");
        }
    }
}