import org.junit.Test;

public class MyComponentTest {

    @Test
    public void testShowBug() {
        MyComponent component = new MyComponent();
        component.showBug();  // TRIGGER BUG: Constructor injection should be used instead of field injection
    }
}