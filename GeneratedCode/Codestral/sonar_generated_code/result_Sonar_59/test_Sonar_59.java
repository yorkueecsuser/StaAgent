import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToOverloadingBugTest {

    @Test
    public void testCompareToOverloadingBug() {
        CompareToOverloadingBug bug = new CompareToOverloadingBug();
        bug.showBug();
        // TRIGGER BUG: "compareTo" should not be overloaded.
        // The test will fail as FooBar class has overloaded the compareTo method instead of overriding it.
    }
}