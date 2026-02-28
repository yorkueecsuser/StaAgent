import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleCastExampleTest {

    @Test
    public void testShowBug() {
        ImpossibleCastExample example = new ImpossibleCastExample();
        Integer result = (Integer) example.showBug(); // TRIGGER BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    }
}