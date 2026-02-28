import org.junit.Test;
import static org.junit.Assert.*;

public class CompileTimeConstantExampleTest {

    @Test
    public void testShowBug() {
        CompileTimeConstantExample example = new CompileTimeConstantExample();
        example.showBug(); // TRIGGER BUG: NonFinalCompileTimeConstant
    }
}