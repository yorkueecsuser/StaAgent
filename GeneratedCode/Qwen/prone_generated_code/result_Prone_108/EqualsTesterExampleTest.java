import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsTesterExampleTest {

    @Test
    public void testShowBug() {
        EqualsTesterExample example = new EqualsTesterExample();
        example.showBug(); // TRIGGER BUG: MissingTestCall
    }
}