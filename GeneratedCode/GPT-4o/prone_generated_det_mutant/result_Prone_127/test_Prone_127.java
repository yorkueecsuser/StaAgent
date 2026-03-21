import org.junit.Test;
import static org.junit.Assert.*;

public class OverlappingAnnotationExampleTest {

    @Test
    public void testShowBug() {
        OverlappingAnnotationExample example = new OverlappingAnnotationExample();
        OverlappingAnnotationExample.Allowance allowance = example.showBug(); // TRIGGER BUG: OverlappingQualifierAndScopeAnnotation
        assertNotNull("Allowance should not be null", allowance); // This assertion is expected to fail due to the bug
    }
}