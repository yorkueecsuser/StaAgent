import org.junit.Test;
import static org.junit.Assert.*;

public class DaggerExampleTest {

    @Test
    public void testProvideStringReturnsNull() {
        DaggerExample example = new DaggerExample();
        assertNotNull("Expected non-null string from provideString", example.showBug()); // TRIGGER BUG: DaggerProvidesNull
    }
}