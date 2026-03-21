import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugExampleTest {

    @Test
    public void testShowBug() {
        OptionalBugExample example = new OptionalBugExample();
        // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
        example.showBug(); 
    }
}