import org.junit.Test;
import static org.junit.Assert.*;

public class GCCallTest {
    @Test
    public void testShowBug() {
        GCCall gcCall = new GCCall();
        gcCall.showBug();  // TRIGGER BUG: DoNotCallGarbageCollectionExplicitly
    }
}