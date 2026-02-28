import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleServiceTest {

    @Test
    public void testShowBug() {
        ExampleService service = new ExampleService(); // TRIGGER BUG: InjectMoreThanOneScopeAnnotationOnClass
        String result = service.showBug();
        assertNotNull(result);
        assertEquals("The class is incorrectly annotated with multiple scope annotations.", result);
        // TRIGGER BUG: InjectMoreThanOneScopeAnnotationOnClass
    }
}