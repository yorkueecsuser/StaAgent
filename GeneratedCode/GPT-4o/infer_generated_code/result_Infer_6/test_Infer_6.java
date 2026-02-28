import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class PrintfArgMismatchTest {

    @Test
    public void testShowBug() {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out); // TRIGGER BUG: CHECKERS_PRINTF_ARGS
    }
}