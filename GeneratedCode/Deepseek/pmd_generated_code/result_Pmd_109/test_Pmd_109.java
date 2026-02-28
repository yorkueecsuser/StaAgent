import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientStringBufferingExampleTest {

    InefficientStringBufferingExample example = new InefficientStringBufferingExample();

    @Test
    public void testShowBug() {
        String result = example.showBug(); // TRIGGER BUG: InefficientStringBuffering
        assertNotNull(result);
    }

}