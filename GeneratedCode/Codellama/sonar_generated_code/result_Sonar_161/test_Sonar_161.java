import org.junit.Test;
import static org.junit.Assert.*;

public class LoopRefactorTest {
    @Test
    public void testBug() {
        LoopRefactor loopRefactor = new LoopRefactor();
        loopRefactor.showBug();
        assertEquals(5, loopRefactor.getI());
    }
}