import org.junit.Test;
import static org.junit.Assert.*;

public class UnsafeWildcardExampleTest {

    @Test
    public void testShowBug() {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        example.showBug(); // TRIGGER BUG: UnsafeWildcard
    }
}