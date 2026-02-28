import org.junit.Test;
import static org.junit.Assert.*;

public class MyComponentTest {

    @Test
    public void testShowBug() {
        MyComponent component = new MyComponent();
        // TRIGGER BUG: Constructor injection should be used instead of field injection
        component.showBug();  // This will throw a NullPointerException if MyComponent is instantiated without a DI framework
    }
}