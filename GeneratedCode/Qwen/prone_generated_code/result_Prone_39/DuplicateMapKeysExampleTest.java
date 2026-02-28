import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateMapKeysExampleTest {

    @Test
    public void testShowBug() {
        DuplicateMapKeysExample example = new DuplicateMapKeysExample();
        example.showBug(); // TRIGGER BUG: DuplicateMapKeys
    }
}