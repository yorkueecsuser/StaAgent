import org.junit.Test;
import static org.junit.Assert.*;

public class MisplacedScopeAnnotationsTest {
    @Test
    public void testShowBug() {
        MisplacedScopeAnnotations misplacedScopeAnnotations = new MisplacedScopeAnnotations("test");
        assertEquals("Buggy code", misplacedScopeAnnotations.showBug());
        // TRIGGER BUG: MisplacedScopeAnnotations
        assertEquals("Buggy code", misplacedScopeAnnotations.showBug());
    }
}