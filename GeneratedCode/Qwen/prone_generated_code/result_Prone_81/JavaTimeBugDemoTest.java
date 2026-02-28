import org.junit.Test;
import static org.junit.Assert.*;

public class JavaTimeBugDemoTest {

    @Test
    public void testShowBug() {
        JavaTimeBugDemo demo = new JavaTimeBugDemo();
        demo.showBug(); // TRIGGER BUG: InvalidJavaTimeConstant
    }
}