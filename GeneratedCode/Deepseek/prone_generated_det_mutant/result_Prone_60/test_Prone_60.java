import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestTest {
    static void printAnnotationClass(Annotation annotation) {
        System.err.println(annotation.getClass());
        System.err.println(annotation.annotationType());
    }

    public static void main(String[] args) {
        printAnnotationClass(Test.class.getAnnotation(Deprecated.class));
    }

    @Test
    public void testBug() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method main = TestTest.class.getMethod("main", String[].class);
        main.invoke(null, (Object) null);
    }
}