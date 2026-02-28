import org.junit.Test;
import static org.junit.Assert.*;

public class FuturesGetCheckedExampleTest {

    @Test(expected = IllegalArgumentException.class)
    public void testShowBug() {
        FuturesGetCheckedExample example = new FuturesGetCheckedExample();
        example.showBug(); // TRIGGER BUG: FuturesGetCheckedIllegalExceptionType
    }
}