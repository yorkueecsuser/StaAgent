import org.junit.Test;
import static org.junit.Assert.*;

public class VarargsBugTest {
    @Test
    public void testShowBug() {
        VarargsBug bug = new VarargsBug();
        bug.showBug();  // TRIGGER BUG: ConfusingArgumentToVarargsMethod
    }
}