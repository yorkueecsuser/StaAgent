import org.junit.Test;
import static org.junit.Assert.*;

public class StringOperationsDemoTest {

    @Test
    public void testShowBug() {
        StringOperationsDemo demo = new StringOperationsDemo();
        demo.showBug(); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }
}