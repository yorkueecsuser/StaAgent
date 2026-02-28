import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedMocksExampleTest {
    @Test
    public void testShowBug() {
        UninitializedMocksExample example = new UninitializedMocksExample();
        // TRIGGER BUG: Annotated Mockito objects should be initialized
        // Calling showBug() without initializing 'bar' will throw a NullPointerException
        example.showBug();
    }
}