import org.junit.Test;
import static org.junit.Assert.*;

class FinalizeOverloadedTest {
    @Test
    public void testFinalizeOverloaded() {
        FinalizeOverloaded obj = new FinalizeOverloaded();
        obj.finalize(1); // TRIGGER BUG: FinalizeOverloaded
    }
}