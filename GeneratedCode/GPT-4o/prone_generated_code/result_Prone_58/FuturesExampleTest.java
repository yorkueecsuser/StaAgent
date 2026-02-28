import org.junit.Test;
import static org.junit.Assert.*;

public class FuturesExampleTest {

    @Test
    public void testShowBug() {
        FuturesExample example = new FuturesExample();
        example.showBug(); // TRIGGER BUG: FuturesGetCheckedIllegalExceptionType
    }
}