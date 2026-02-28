import org.junit.Test;
import static org.junit.Assert.*;

class BrokenNullCheckTest {
    @Test
    void testBugTrigger() {
        BrokenNullCheck buggyCode = new BrokenNullCheck();
        buggyCode.showBug();
        // TRIGGER BUG: BrokenNullCheck
        assertNull(list.get(0) || list.get(1));
    }
}