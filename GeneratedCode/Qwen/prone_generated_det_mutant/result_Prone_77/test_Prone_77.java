import org.junit.Test;
import static org.junit.Assert.*;

// Trigger line: 15
@javax.inject.Singleton
@javax.inject.Named // BUG: InjectMoreThanOneScopeAnnotationOnClass
class ScopeAnnotationBug {

    public String showBug() {
        return "This class has more than one scope annotation, which is invalid.";
    }

    public static void main(String[] args) {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        System.out.println(bug.showBug());
    }
}

public class ScopeAnnotationBugTest {

    @Test
    public void testShowBug() {
        ScopeAnnotationBug bug = new ScopeAnnotationBug();
        assertEquals("This class has more than one scope annotation, which is invalid.", bug.showBug()); // TRIGGER BUG: InjectMoreThanOneScopeAnnotationOnClass
    }
}