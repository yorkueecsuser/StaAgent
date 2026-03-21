import org.junit.Test;
import static org.junit.Assert.*;

public class EmptyCatchBlockExampleTest {

    @Test
    public void testShowBug() {
        EmptyCatchBlockExample example = new EmptyCatchBlockExample();
        example.showBug(); // TRIGGER BUG: EmptyCatchBlock
    }
}