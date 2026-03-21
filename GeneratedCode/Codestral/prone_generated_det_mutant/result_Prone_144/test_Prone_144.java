import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantSetterCallBugTest {
    @Test
    public void testRedundantSetterCall() {
        RedundantSetterCallBug bug = new RedundantSetterCallBug();
        RedundantSetterCallBug.MyProto proto1 = RedundantSetterCallBug.MyProto.newBuilder().setFoo("foo").build();
        RedundantSetterCallBug.MyProto proto2 = RedundantSetterCallBug.MyProto.newBuilder().setFoo("bar").build();

        RedundantSetterCallBug.MyProto result = bug.showBug(proto2);

        // TRIGGER BUG: RedundantSetterCall
        assertEquals(proto1.getFoo(), result.getFoo());
    }
}