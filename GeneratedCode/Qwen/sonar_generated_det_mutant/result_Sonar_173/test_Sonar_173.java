import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test(expected = Throwable.class)
    public void testShowBug() throws Throwable {
        FinalizeExample example = new FinalizeExample();
        assertEquals("Finalize method was explicitly called", example.showBug()); // TRIGGER BUG: The "Object.finalize()" method should not be called
    }
}