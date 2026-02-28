import org.junit.Test;
import static org.junit.Assert.*;

public class NonFinalCompileTimeConstantTest {
    @Test
    public void test() {
        NonFinalCompileTimeConstant nfc = new NonFinalCompileTimeConstant();
        nfc.showBug();
        // TRIGGER BUG: NonFinalCompileTimeConstant
    }
}