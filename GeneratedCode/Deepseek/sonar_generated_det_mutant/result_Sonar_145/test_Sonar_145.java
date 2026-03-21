import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBugExampleTest {
    @Test
    public void testShowBug() {
        ArrayBugExample obj = new ArrayBugExample();
        obj.showBug();  // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
    }
}