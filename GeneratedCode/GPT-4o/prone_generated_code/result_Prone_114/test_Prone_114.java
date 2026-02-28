import org.junit.Test;
import static org.junit.Assert.*;

public class MultiInjectConstructorExampleTest {

    @Test
    public void testShowBugWithDefaultConstructor() {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample(); // TRIGGER BUG: MoreThanOneInjectableConstructor
        String result = example.showBug("Test Value");
        assertEquals("Test Value", result);
    }

    @Test
    public void testShowBugWithStringConstructor() {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample("Another Test Value"); // TRIGGER BUG: MoreThanOneInjectableConstructor
        String result = example.showBug("Test Value");
        assertEquals("Another Test Value", result);
    }
}