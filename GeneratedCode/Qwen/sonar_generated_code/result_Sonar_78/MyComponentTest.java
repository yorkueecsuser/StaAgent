import org.junit.Test;
import static org.junit.Assert.*;

public class MyComponentTest {

    @Test
    public void testMyBusinessMethodWithFieldInjection() {
        MyComponent component = new MyComponent(); // TRIGGER BUG: Constructor injection should be used instead of field injection
        assertEquals("NullPointerException caught", component.showBug());
    }
}