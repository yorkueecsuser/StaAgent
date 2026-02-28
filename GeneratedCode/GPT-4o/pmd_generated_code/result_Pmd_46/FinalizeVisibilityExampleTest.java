import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeVisibilityExampleTest {

    @Test
    public void testShowBug() {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        String result = example.showBug(); // TRIGGER BUG: FinalizeShouldBeProtected
        assertEquals("Finalize method was called manually.", result); // TRIGGER BUG: FinalizeShouldBeProtected
    }
}