import org.junit.Test;
import static org.junit.Assert.*;

public class ThrowNullExampleTest {

    @Test
    public void testShowBug() {
        ThrowNullExample example = new ThrowNullExample();
        example.showBug(); // TRIGGER BUG: ThrowNull
    }
}