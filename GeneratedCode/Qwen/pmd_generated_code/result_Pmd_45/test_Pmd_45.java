import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeOverloadedExampleTest {

    @Test
    public void testFinalizeOverloaded() {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug(); // TRIGGER BUG: FinalizeOverloaded
    }
}