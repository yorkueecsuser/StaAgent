import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleCastBugTest {
    @Test
    public void testShowBug() {
        Object obj = "This is a string";
        // TRIGGER BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        Integer result = ImpossibleCastBug.showBug(obj);
    }
}