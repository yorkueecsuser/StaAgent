import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyDependencyInjectionTest {

    @Test(expected = IllegalStateException.class)
    public void testShowBug_TriggerBug() {
        // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        BuggyDependencyInjection buggyDependencyInjection = new BuggyDependencyInjection(new Dependency1(), new Dependency2());
        buggyDependencyInjection.showBug();
    }
}