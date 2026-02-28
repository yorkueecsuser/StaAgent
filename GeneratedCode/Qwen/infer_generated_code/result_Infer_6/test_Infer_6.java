import org.junit.Test;
import static org.junit.Assert.*;

public class PrintfArgsBugTest {

    @Test
    public void testStringInsteadOfInteger() {
        PrintfArgsBug bugInstance = new PrintfArgsBug();
        bugInstance.showBug();  // TRIGGER BUG: CHECKERS_PRINTF_ARGS
    }
}