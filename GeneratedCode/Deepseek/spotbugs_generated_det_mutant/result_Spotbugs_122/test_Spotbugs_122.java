import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class ImpossibleDowncastTest {
    @Test
    public void testGetAsArray() {
        ImpossibleDowncast id = new ImpossibleDowncast();
        id.showBug();
        // TRIGGER BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
}