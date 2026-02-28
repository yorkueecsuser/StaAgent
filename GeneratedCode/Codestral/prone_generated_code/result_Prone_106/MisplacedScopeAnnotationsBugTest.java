import org.junit.Test;
import static org.junit.Assert.*;

public class MisplacedScopeAnnotationsBugTest {
    @Test
    public void testDeprecatedAnnotation() {
        MisplacedScopeAnnotationsBug bug = new MisplacedScopeAnnotationsBug();
        bug.addElement("Example");
        bug.showBug();  // TRIGGER BUG: MisplacedScopeAnnotations

        // The line above triggers the bug because the '@Deprecated' annotation is misplaced
        // on the local variable 'deprecatedElements' in the'showBug' method.
        // This annotation should be placed on the 'elements' list in the class level,
        // not just the local reference.
        // Since we are not catching the exception, the test will fail because the '@Deprecated' annotation
        // on the local variable has no effect.
    }
}