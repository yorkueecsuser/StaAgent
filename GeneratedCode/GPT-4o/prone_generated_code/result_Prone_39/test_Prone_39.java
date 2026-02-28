import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class DuplicateMapKeysExampleTest {

    @Test
    public void testShowBug() {
        DuplicateMapKeysExample example = new DuplicateMapKeysExample();
        example.showBug();  // TRIGGER BUG: DuplicateMapKeys
    }
}