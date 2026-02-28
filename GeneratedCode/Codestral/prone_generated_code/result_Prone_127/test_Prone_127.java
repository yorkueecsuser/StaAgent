import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstratorTest {
    @Test
    public void showBugTest() {
        BugDemonstrator demonstrator = new BugDemonstrator();
        Allowance allowance1 = demonstrator.showBug();
        Allowance allowance2 = demonstrator.showBug();

        // TRIGGER BUG: OverlappingQualifierAndScopeAnnotation
        // The bug is triggered because @DayScoped is used both as a Scope annotation and a Qualifier annotation.
        // As a result, a new Allowance instance is created every time showBug() is called,
        // which is not the intended behavior of having a single DailyAllowance instance per day.
        assertNotSame(allowance1, allowance2);
    }
}