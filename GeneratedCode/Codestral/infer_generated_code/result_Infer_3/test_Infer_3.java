import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationReachabilityErrorTest {

    @Test
    public void testBugTrigger() {
        AnnotationReachabilityError error = new AnnotationReachabilityError();
        error.showBug(); // TRIGGER BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }
}