import org.junit.Test;
import static org.junit.Assert.*;

public class CallSuperFirstExampleTest {

    @Test
    public void testShowBug() {
        CallSuperFirstExample example = new CallSuperFirstExample();
        String result = example.showBug(); // TRIGGER BUG: CallSuperFirst
        assertEquals("Bug demonstrated: Super not called first in constructor.", result);
    }
}