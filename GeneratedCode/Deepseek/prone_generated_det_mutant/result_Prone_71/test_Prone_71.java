import org.junit.Test;
import static org.junit.Assert.*;

public class IncomparableTest {

    @Test // TRIGGER BUG: Incomparable
    public void testShowBug() {
        Incomparable incomparable = new Incomparable();
        incomparable.showBug();
    }
}