import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationReachabilityErrorExampleTest {

    @Test
    public void testBugTrigger() {
        AnnotationReachabilityErrorExample testInstance = new AnnotationReachabilityErrorExample();
        // TRIGGER BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
        testInstance.doSomethingUiThread();
        // Expected exception: Annotation Reachability Error
    }
}