import org.junit.Test;

// Assuming all necessary classes are in the correct package or imported
public class MyConfigurationTest {

    @Test
    public void testShowBug() {
        MyConfiguration config = new MyConfiguration();
        config.showBug(); // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    }
}