import org.junit.Test;
import static org.junit.Assert.*;

public class ArbitraryCodeExecutionUnderLockExampleTest {

    @Test
    public void testShowBug() {
        ArbitraryCodeExecutionUnderLockExample example = new ArbitraryCodeExecutionUnderLockExample();
        example.showBug();  // TRIGGER BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }
}