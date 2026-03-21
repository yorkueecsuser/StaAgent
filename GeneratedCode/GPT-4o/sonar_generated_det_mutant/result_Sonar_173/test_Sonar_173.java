import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeMethodExampleTest {
    
    @Test
    public void testShowBug() throws Throwable {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug(); // TRIGGER BUG: The "Object.finalize()" method should not be called
    }
}