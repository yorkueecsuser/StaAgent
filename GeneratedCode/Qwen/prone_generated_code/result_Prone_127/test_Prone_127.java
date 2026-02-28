import org.junit.Test;
import static org.junit.Assert.*;

public class OverlappingQualifierAndScopeAnnotationExampleTest {

    @Test
    public void testShowBug() {
        OverlappingQualifierAndScopeAnnotationExample example = new OverlappingQualifierAndScopeAnnotationExample();
        Allowance allowance = example.showBug(); // TRIGGER BUG: OverlappingQualifierAndScopeAnnotation
        assertNotNull(allowance); // This assertion will pass, but the bug is in the misconfiguration of the annotation, not in the null check.
    }
}