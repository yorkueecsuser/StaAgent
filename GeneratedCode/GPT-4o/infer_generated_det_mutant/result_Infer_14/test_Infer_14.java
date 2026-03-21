import org.junit.Test;
import static org.junit.Assert.*;

public class StarvationExampleTest {

    @Test
    public void testShowBug() {
        StarvationExample example = new StarvationExample();
        example.showBug(); // TRIGGER BUG: STARVATION
    }
}