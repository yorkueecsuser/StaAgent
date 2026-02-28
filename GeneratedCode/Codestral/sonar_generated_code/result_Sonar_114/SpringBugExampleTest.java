import org.junit.Test;
import static org.junit.Assert.*;

public class SpringBugExampleTest {
    @Test
    // TRIGGER BUG: Methods with Spring proxying annotations should be public
    public void testTransactionalMethod() {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }
}