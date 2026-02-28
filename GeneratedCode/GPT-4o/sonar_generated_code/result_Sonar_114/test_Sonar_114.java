import org.junit.Test;
import static org.junit.Assert.*;

public class SpringProxyBugExampleTest {

    @Test
    public void testShowBug() {
        SpringProxyBugExample example = new SpringProxyBugExample();
        example.showBug(); // TRIGGER BUG: Methods with Spring proxying annotations should be public
    }
}