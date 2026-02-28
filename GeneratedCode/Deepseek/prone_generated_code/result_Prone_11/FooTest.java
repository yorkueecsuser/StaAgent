import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class FooTest {
    @Test
    public void testBadAnnotationImplementation() throws Exception {
        Annotation manual = Foo.someAnnotationInstance("hello");
        Method method = Foo.class.getMethod("annotatedMethod");
        Annotation fromMethod = method.getDeclaredAnnotations()[0];

        assertFalse(manual.equals(fromMethod)); 
        // TRIGGER BUG: BadAnnotationImplementation
    }
}