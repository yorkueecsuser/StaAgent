import org.junit.Test;
import static org.junit.Assert.*;

public class BugGeneratorTest {

    BugGenerator generator = new BugGenerator();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        generator.showBug(null);
    }
}