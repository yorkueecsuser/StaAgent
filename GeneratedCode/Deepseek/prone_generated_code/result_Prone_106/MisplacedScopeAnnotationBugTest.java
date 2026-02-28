import org.junit.Test;
import static org.junit.Assert.*;

public class MisplacedScopeAnnotationBugTest {
    @Test
    public void testShowBug() {
        MisplacedScopeAnnotationBug bug = new MisplacedScopeAnnotationBug();
        // TRIGGER BUG: MisplacedScopeAnnotations
        // We should not be able to pass a String to a method annotated with @Scope
        bug.showBug("MisplacedScopeAnnotations"); // This should fail
    }
}