import org.junit.Test;
import static org.junit.Assert.*;

public class NullCheckExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullCheckExample example = new NullCheckExample();
        example.showBug(null, "test"); // TRIGGER BUG: MisplacedNullCheck
    }

    @Test
    public void testShowBug2WithNullInput() {
        NullCheckExample example = new NullCheckExample();
        example.showBug2(null, "test"); // TRIGGER BUG: MisplacedNullCheck
    }
}