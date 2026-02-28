import org.junit.Test;
import static org.junit.Assert.*;

public class GuiceAssistedInjectExampleTest {

    @Test
    public void testShowBug() {
        GuiceAssistedInjectExample example = new GuiceAssistedInjectExample();
        example.showBug(); // TRIGGER BUG: GuiceAssistedInjectScoping
    }
}