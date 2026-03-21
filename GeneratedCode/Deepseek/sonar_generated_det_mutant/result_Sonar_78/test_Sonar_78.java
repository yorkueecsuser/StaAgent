import org.junit.Test;
import static org.junit.Assert.*;

public class MyComponentTest {

    @Test
    public void testConstructorInjection() {
        MyComponent component = new MyComponent(null); 
        // TRIGGER BUG: Constructor injection should be used instead of field injection
    }

    @Test
    public void testShowBug() {
        MyComponent component = new MyComponent(null); 
        component.showBug(); 
        // TRIGGER BUG: Constructor injection should be used instead of field injection
    }
}