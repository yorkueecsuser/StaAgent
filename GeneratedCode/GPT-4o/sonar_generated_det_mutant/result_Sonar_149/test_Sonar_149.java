import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;

public class AnnotationReflectionBugExampleTest {

    @Test
    public void testShowBugWithExampleMethod() throws NoSuchMethodException {
        AnnotationReflectionBugExample example = new AnnotationReflectionBugExample();
        Method method = AnnotationReflectionBugExample.class.getMethod("exampleMethod");
        boolean result = example.showBug(method); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
        assertFalse("The method should not have an @Override annotation present", result);
    }

    @Test
    public void testShowBugWithToStringMethod() throws NoSuchMethodException {
        AnnotationReflectionBugExample example = new AnnotationReflectionBugExample();
        Method method = AnnotationReflectionBugExample.class.getMethod("toString");
        boolean result = example.showBug(method); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
        assertFalse("The method should not have an @Override annotation present", result);
    }
}