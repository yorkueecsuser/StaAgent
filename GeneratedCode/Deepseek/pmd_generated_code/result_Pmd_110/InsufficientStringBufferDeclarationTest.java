import org.junit.Test;
import static org.junit.Assert.*;

public class InsufficientStringBufferDeclarationTest {

    @Test
    public void testShowBug() {
        InsufficientStringBufferDeclaration test = new InsufficientStringBufferDeclaration();
        String result = test.showBug();

        // TRIGGER BUG: InsufficientStringBufferDeclaration
        assertEquals("This is a long string that will exceed the default 16 characters", result); 
    }
}