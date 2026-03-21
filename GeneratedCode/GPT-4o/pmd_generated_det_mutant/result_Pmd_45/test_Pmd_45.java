import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeOverloadExampleTest {

    @Test
    public void testShowBug() {
        FinalizeOverloadExample example = new FinalizeOverloadExample();
        // This will directly trigger the overloaded finalize methods
        String result = example.showBug(10, "Hello"); // TRIGGER BUG: FinalizeOverloaded
        assertEquals("Overloaded finalize methods were called.", result);
    }
}