import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceofCheckInCatchClauseBugTest {

    @Test
    public void testShowBug() {
        InstanceofCheckInCatchClauseBug buggyClass = new InstanceofCheckInCatchClauseBug();
        buggyClass.showBug(); // TRIGGER BUG: AvoidInstanceofChecksInCatchClause
    }
}