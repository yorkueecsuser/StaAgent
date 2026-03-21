import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class VarargsBugExampleTest {

    @Test
    public void testShowBugTrue() {
        VarargsBugExample example = new VarargsBugExample();
        Object result = example.showBug(true); // TRIGGER BUG: InexactVarargsConditional
        assertEquals("[[1, 2]]", Arrays.deepToString(new Object[]{result}));
    }

    @Test
    public void testShowBugFalse() {
        VarargsBugExample example = new VarargsBugExample();
        Object result = example.showBug(false); // TRIGGER BUG: InexactVarargsConditional
        assertEquals("[3]", Arrays.deepToString(new Object[]{result}));
    }
}