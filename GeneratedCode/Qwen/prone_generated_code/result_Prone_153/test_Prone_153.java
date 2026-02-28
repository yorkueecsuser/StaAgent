import org.junit.Test;
import static org.junit.Assert.*;

public class EvenArgsBugTest {

    @Test
    public void testShowBugWithOddNumberOfArguments() {
        EvenArgsBug bugDemo = new EvenArgsBug();
        bugDemo.showBug("key1", "value1", "key2"); // TRIGGER BUG: ShouldHaveEvenArgs
    }

    @Test
    public void testShowBug1WithOddNumberOfArguments() {
        EvenArgsBug bugDemo = new EvenArgsBug();
        bugDemo.showBug1("keyA", "valueA", "keyB"); // TRIGGER BUG: ShouldHaveEvenArgs
    }
}