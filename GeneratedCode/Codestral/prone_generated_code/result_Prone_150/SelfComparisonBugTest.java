import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonBugTest {

    @Test
    public void testSelfComparisonBug() {
        SelfComparisonBug buggyObj = new SelfComparisonBug(5);
        SelfComparisonBug otherObj = new SelfComparisonBug(6);
        assertNotEquals("SelfComparison bug triggered", 0, buggyObj.compareTo(otherObj)); // TRIGGER BUG: SelfComparison
    }
}