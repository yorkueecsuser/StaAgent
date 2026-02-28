import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testCompareToWithGreaterValue() {
        CompareToBugExample example1 = new CompareToBugExample(10);
        CompareToBugExample example2 = new CompareToBugExample(5);
        assertEquals(-1, example1.showBug(example2)); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
    }

    @Test
    public void testCompareToWithEqualValue() {
        CompareToBugExample example1 = new CompareToBugExample(10);
        CompareToBugExample example2 = new CompareToBugExample(10);
        assertEquals(0, example1.showBug(example2));
    }

    @Test
    public void testCompareToWithLesserValue() {
        CompareToBugExample example1 = new CompareToBugExample(5);
        CompareToBugExample example2 = new CompareToBugExample(10);
        assertEquals(-1, example1.showBug(example2)); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
    }
}