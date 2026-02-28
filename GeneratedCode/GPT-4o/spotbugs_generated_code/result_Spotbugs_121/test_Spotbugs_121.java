import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleDowncastExampleTest {

    @Test
    public void testShowBug() {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug(); // TRIGGER BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
    }
}