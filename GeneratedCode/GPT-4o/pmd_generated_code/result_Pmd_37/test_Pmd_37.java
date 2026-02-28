import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionInFinallyDemoTest {

    @Test
    public void testShowBug() {
        ExceptionInFinallyDemo demo = new ExceptionInFinallyDemo();
        demo.showBug(); // TRIGGER BUG: DoNotThrowExceptionInFinally
    }
}