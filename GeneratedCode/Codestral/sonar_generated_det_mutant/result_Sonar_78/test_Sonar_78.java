import org.junit.Test;
import static org.junit.Assert.*;

public class MyComponentTest {
    @Test
    public void testShowBug() {
        MyComponent myComponent = new MyComponent(null);
        myComponent.showBug(); // TRIGGER BUG: Constructor injection should not be used for null values
    }
}