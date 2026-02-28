// JUnit Test Code for TooFewBranchesForASwitchStatement.java
import org.junit.Test;
import static org.junit.Assert.*;

public class TooFewBranchesForASwitchStatementTest {
    @Test
    public void testShowBug() {
        TooFewBranchesForASwitchStatement testObject = new TooFewBranchesForASwitchStatement();
        testObject.showBug();
    }
}