import org.junit.Test;
import static org.junit.Assert.*;

public class UnsupportedOperationExampleTest {

    @Test
    public void testShowBug() {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug(); // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
    }
}