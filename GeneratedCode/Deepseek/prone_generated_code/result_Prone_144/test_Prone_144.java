import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantSetterCallBugTest {

    @Test
    // TRIGGER BUG: RedundantSetterCall
    public void testShowBug() {
        RedundantSetterCallBug bug = new RedundantSetterCallBug("foo", "bar");
        RedundantSetterCallBug.MyProto proto = bug.showBug();
        assertEquals("bar", proto.getFoo());
    }
}