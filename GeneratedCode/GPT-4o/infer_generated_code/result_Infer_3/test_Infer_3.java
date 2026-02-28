import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationReachabilityErrorExampleTest {

    @Test
    public void testShowBug() {
        AnnotationReachabilityErrorExample example = new AnnotationReachabilityErrorExample();
        example.showBug(); // TRIGGER BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }
}