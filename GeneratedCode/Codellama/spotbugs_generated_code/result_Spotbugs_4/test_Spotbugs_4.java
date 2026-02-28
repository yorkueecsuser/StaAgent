import org.junit.Test;
import static org.junit.Assert.*;

public class UnresolvableReferenceBugTest {
    @Test
    public void testBugTrigger() {
        UnresolvableReferenceBug bug = new UnresolvableReferenceBug();
        bug.showBug();
    }
}