import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.function.Function;

public class AnnotationReflectionBugTest {

    @Test
    public void testShowBug1WithOverrideAnnotation() throws NoSuchMethodException {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        Method hashCodeMethod = Integer.class.getMethod("hashCode");
        boolean result = bugDemo.showBug1(hashCodeMethod); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
        assertTrue(result); // This assertion will fail because @Override is not available at runtime
    }

    @Test
    public void testShowBugWithFunctionalInterfaceAnnotation() {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        boolean result = bugDemo.showBug(Function.class);
        assertTrue(result); // This assertion will pass because @FunctionalInterface is available at runtime
    }
}