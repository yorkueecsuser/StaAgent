import org.junit.Test;
import static org.junit.Assert.*;

public class ComparableDemoTest {

    @Test
    public void testCompareToWithBug() {
        ComparableDemo demo1 = new ComparableDemo(1);
        ComparableDemo demo2 = new ComparableDemo(2);
        int result = demo1.showBug(demo2); // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
        
        // The assert will fail because Integer.MIN_VALUE is not expected
        assertEquals(-1, result);
    }
}