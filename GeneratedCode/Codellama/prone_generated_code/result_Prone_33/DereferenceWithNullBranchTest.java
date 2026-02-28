import org.junit.Test;
import static org.junit.Assert.*;

public class DereferenceWithNullBranchTest {
    @Test
    public void testBug() {
        DereferenceWithNullBranch dwnb = new DereferenceWithNullBranch();
        dwnb.showBug();
        // TRIGGER BUG: DereferenceWithNullBranch
    }
}