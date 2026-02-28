import org.junit.Test;
import static org.junit.Assert.*;

public class GetClassOnAnnotationBugTest {

    @Test
    public void testBugTrigger() {
        MyClass obj = new MyClass();
        Annotation annotation = obj.getClass().getAnnotation(MyAnnotation.class);
        // TRIGGER BUG: GetClassOnAnnotation
        System.out.println(annotation.getClass());
        System.out.println(annotation.annotationType());
    }
}