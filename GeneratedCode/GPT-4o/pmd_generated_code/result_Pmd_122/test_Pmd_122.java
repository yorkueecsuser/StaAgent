import org.junit.Test;
import static org.junit.Assert.*;

public class StringConcatenationExampleTest {

    @Test
    public void testShowBug() {
        StringConcatenationExample example = new StringConcatenationExample();
        int n = 1000; // A larger number to make the inefficiency evident
        String result = example.showBug(n); // TRIGGER BUG: UseStringBufferForStringAppends
        assertNotNull(result); // The assertion itself doesn't fail, but the inefficiency is present
        // No direct assert statement since the inefficiency cannot be caught by assert methods
    }
}