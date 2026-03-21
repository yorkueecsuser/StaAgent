import org.junit.Test;
import static org.junit.Assert.*;

public class NullableInjectedFieldDemoTest {

    @Test
    public void testShowBug() {
        NullableInjectedFieldDemo demo = new NullableInjectedFieldDemo();
        demo.showBug(); // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
    }
}