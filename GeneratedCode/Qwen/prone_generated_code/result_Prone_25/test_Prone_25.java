import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleClassTest {

    @Test
    public void testShowBugWithNonCompileTimeConstant() {
        ExampleClass example = new ExampleClass();
        assertEquals("Processed: non-compile-time-constant", example.showBug("non-compile-time-constant")); // TRIGGER BUG: CompileTimeConstant
    }
}