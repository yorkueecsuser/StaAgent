import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleDowncastTest {

    ImpossibleDowncast obj = new ImpossibleDowncast();

    @Test // TRIGGER BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
    public void testShowBug() {
        obj.showBug();
    }
}