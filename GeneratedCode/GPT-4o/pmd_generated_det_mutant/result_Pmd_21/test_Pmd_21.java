import org.junit.Test;
import static org.junit.Assert.*;

public class CallSuperLastExampleTest {

    @Test
    public void testShowBug() {
        CallSuperLastExample example = new CallSuperLastExample();
        String result = example.showBug(); // TRIGGER BUG: CallSuperLast
        assertEquals("Bug demonstrated: super method called first.", result); // TRIGGER BUG: CallSuperLast
    }
}