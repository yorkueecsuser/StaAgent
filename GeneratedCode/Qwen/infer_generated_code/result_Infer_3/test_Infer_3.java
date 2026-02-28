import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationReachabilityErrorTest {

    @Test
    public void testAnnotationReachabilityError() {
        AnnotationReachabilityError instance = new AnnotationReachabilityError();
        instance.showBug(); // TRIGGER BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }
}