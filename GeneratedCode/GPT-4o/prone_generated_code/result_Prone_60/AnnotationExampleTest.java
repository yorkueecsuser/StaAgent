import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationExampleTest {

    @Test
    public void testShowBug() {
        AnnotationExample.showBug(); // TRIGGER BUG: GetClassOnAnnotation
    }
}