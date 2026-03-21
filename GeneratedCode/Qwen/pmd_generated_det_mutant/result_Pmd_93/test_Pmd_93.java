import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadRunExampleTest {

    @Test
    public void testShowBugTriggersDontCallThreadRun() {
        ThreadRunExample example = new ThreadRunExample();
        String result = example.showBug(); // TRIGGER BUG: DontCallThreadRun
        assertEquals("Bug demonstrated", result);
    }
}