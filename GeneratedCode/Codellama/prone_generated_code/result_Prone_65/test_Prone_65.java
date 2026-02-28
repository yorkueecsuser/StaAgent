import org.junit.Test;
import static org.junit.Assert.*;

public class FinalFieldInjectionTest {
    @Test
    public void testShowBug() {
        FinalFieldInjection obj = new FinalFieldInjection();
        obj.showBug("input");
        // TRIGGER BUG: GuiceInjectOnFinalField
    }
}