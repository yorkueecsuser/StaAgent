import org.junit.Test;
import static org.junit.Assert.*;

public class IncomparableExampleTest {

    @Test
    public void testShowBug() {
        IncomparableExample example = new IncomparableExample();
        example.showBug(); // TRIGGER BUG: Incomparable
    }
}