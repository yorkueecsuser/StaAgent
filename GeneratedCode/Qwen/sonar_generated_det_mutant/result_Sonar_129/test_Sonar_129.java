import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testCompareToReturnsNegativeValue() {
        CompareToBugExample example1 = new CompareToBugExample(5);
        CompareToBugExample example2 = new CompareToBugExample(10);
        int result = example1.showBug(example2); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
        assertEquals(-1, result); // This assertion will fail because the actual result is Integer.MIN_VALUE
    }

    @Test
    public void testCompareToReturnsPositiveValue() {
        CompareToBugExample example1 = new CompareToBugExample(15);
        CompareToBugExample example2 = new CompareToBugExample(10);
        int result = example1.showBug(example2);
        assertEquals(1, result); // This assertion will pass
    }

    @Test
    public void testCompareToReturnsZero() {
        CompareToBugExample example1 = new CompareToBugExample(10);
        CompareToBugExample example2 = new CompareToBugExample(10);
        int result = example1.showBug(example2);
        assertEquals(0, result); // This assertion will pass
    }
}