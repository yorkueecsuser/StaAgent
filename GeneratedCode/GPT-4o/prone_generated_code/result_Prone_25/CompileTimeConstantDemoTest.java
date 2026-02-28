import org.junit.Test;
import static org.junit.Assert.*;

public class CompileTimeConstantDemoTest {

    @Test
    public void testShowBug() {
        CompileTimeConstantDemo demo = new CompileTimeConstantDemo();
        demo.showBug(42); // TRIGGER BUG: CompileTimeConstant
    }
}