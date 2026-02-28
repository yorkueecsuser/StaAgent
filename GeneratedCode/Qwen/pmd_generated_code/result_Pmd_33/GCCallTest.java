import org.junit.Test;

public class GCAllTest {

    @Test
    public void testShowBug() {
        GCCall gcCall = new GCCall();
        gcCall.showBug(); // TRIGGER BUG: DoNotCallGarbageCollectionExplicitly
    }

    @Test
    public void testShowBug1() {
        GCCall gcCall = new GCCall();
        gcCall.showBug1(); // TRIGGER BUG: DoNotCallGarbageCollectionExplicitly
    }
}