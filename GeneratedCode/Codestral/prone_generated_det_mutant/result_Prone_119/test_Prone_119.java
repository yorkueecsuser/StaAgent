import org.junit.Test;
import static org.junit.Assert.*;

public class CompileTimeConstantBugTest {
    @Test
    public void showBugTest() {
        CompileTimeConstantBug bug = new CompileTimeConstantBug();
        bug.showBug(10); // TRIGGER BUG: NonFinalCompileTimeConstant
    }
}