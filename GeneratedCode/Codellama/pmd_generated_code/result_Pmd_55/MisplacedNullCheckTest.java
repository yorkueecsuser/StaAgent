import org.junit.Test;
import static org.junit.Assert.*;

class MisplacedNullCheckTest {
    @Test
    public void testShowBug() {
        MisplacedNullCheck misplacedNullCheck = new MisplacedNullCheck();
        assertThrows(NullPointerException.class, () -> misplacedNullCheck.main(null));
    }
}