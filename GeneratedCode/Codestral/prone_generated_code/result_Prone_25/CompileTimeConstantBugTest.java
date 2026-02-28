import org.junit.Test;
import static org.junit.Assert.*;

public class CompileTimeConstantBugTest {

    @Test
    public void testCompileTimeConstantBug() {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        int myValue = 10;
        bug.showBug(myValue); // TRIGGER BUG: CompileTimeConstant
        // The bug is triggered when a non-compile-time constant expression is passed to a method parameter annotated with @CompileTimeConstant.
    }
}