import org.junit.Test;
import static org.junit.Assert.*;

public class ThisNullBugTest {

    @Test
    public void testShowBug() {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
        // TRIGGER BUG: ComparingThisWithNull
    }
}