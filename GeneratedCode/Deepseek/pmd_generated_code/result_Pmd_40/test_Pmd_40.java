import org.junit.Test;
import static org.junit.Assert.*;

class EmptyCatchBlockExampleTest {
    EmptyCatchBlockExample example = new EmptyCatchBlockExample();

    @Test
    public void testShowBug() {
        example.showBug(); // TRIGGER BUG: EmptyCatchBlock
    }
}