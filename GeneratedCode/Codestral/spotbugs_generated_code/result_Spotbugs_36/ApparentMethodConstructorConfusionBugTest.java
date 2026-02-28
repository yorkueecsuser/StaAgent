import org.junit.Test;
import static org.junit.Assert.*;

public class ApparentMethodConstructorConfusionBugTest {

    @Test
    public void testApparentMethodConstructorConfusionBug() {
        ApparentMethodConstructorConfusionBug bug = new ApparentMethodConstructorConfusionBug();
        bug.showBug("Test Input"); // TRIGGER BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    }
}