import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {
    
    @Test
    public void testShowBug() {
        Example example = new Example();
        int[] result = example.showBug();
        assertNotNull(result); // TRIGGER BUG: ReturnEmptyCollectionRatherThanNull
    }
}