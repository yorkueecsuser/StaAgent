import org.junit.Test;
import static org.junit.Assert.*;

public class SpringAnnotationBugExampleTest {

    @Test
    public void testShowBugTriggersTransactionalIssue() {
        SpringAnnotationBugExample example = new SpringAnnotationBugExample();
        example.showBug(); // TRIGGER BUG: Methods with Spring proxying annotations should be public
    }
}