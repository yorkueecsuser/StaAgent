import org.junit.Test;
import static org.junit.Assert.*;

public class CloneBugExampleTest {

    @Test
    public void testShowBug() {
        CloneBugExample example = new CloneBugExample(10);
        CloneBugExample clonedExample = example.showBug(); // TRIGGER BUG: CloneMethodReturnTypeMustMatchClassName
        assertEquals(example.getValue(), clonedExample.getValue());
    }
}