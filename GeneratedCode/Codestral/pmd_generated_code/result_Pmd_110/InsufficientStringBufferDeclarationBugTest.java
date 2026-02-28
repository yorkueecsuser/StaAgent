import org.junit.Test;
import static org.junit.Assert.*;

public class InsufficientStringBufferDeclarationBugTest {

    @Test
    public void testShowBug() {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        // TRIGGER BUG: InsufficientStringBufferDeclaration
        bug.showBug();
        // The test will fail here because the StringBuilder in the showBug() method is not pre-sized,
        // causing it to resize multiple times during runtime when appending a long string.
    }
}