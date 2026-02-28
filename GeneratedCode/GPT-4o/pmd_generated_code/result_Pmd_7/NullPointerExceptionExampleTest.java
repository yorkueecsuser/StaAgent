import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExceptionExampleTest {

    @Test
    public void testShowBug() {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug(); // TRIGGER BUG: AvoidCatchingNPE
    }
}