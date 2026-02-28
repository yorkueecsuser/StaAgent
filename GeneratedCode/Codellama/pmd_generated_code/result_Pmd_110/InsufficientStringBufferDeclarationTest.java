import org.junit.Test;
import static org.junit.Assert.*;

class InsufficientStringBufferDeclarationTest {
    @Test
    public void testBug() {
        InsufficientStringBufferDeclaration buggyCode = new InsufficientStringBufferDeclaration();
        buggyCode.showBug();
        // TRIGGER BUG: InsufficientStringBufferDeclaration
    }
}