import org.junit.Assert;
import org.junit.Test;

public class ReflectionAccessibilityTest {
    @Test
    public void testShowBug() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ReflectionAccessibility reflectionAccessibility = new ReflectionAccessibility();
        reflectionAccessibility.showBug("com.example.ExampleClass");
    }
}