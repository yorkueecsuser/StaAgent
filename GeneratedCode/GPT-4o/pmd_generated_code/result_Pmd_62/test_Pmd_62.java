import org.junit.Test;
import static org.junit.Assert.*;

public class NonStaticInitializerExampleTest {

    @Test
    public void testShowBug() {
        NonStaticInitializerExample example = new NonStaticInitializerExample(); // TRIGGER BUG: NonStaticInitializer
        String result = example.showBug(); // TRIGGER BUG: NonStaticInitializer
        assertEquals("Check console output for bug demonstration.", result);
    }
}