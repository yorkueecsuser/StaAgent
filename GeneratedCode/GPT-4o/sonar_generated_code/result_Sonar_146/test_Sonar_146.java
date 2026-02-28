import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionSelfArgumentExampleTest {

    @Test
    public void testShowBug() {
        CollectionSelfArgumentExample example = new CollectionSelfArgumentExample();
        example.showBug(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
    }
}