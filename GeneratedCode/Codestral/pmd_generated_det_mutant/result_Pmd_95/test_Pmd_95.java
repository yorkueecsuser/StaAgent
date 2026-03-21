import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeSingletonTest {

    @Test
    public void showBugTest() {
        NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
        assertEquals(2, singleton.showBug()); // TRIGGER BUG: NonThreadSafeSingleton
    }
}