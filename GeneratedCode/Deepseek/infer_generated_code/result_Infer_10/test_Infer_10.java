import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {
    @Test
    public void testShowBug() {
        I i = new I() {
            @Override
            public void bar() {
                // Nothing to do here
            }
        };

        C c = new C();
        c.showBug(i); // TRIGGER BUG: INTERFACE_NOT_THREAD_SAFE
    }
}