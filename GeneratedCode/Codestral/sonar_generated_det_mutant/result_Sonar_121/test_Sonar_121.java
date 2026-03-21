import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugTest {

    @Test
    public void testShowBug() {
        CompareToBug.CustomObject obj1 = new CompareToBug.CustomObject(5);
        CompareToBug.CustomObject obj2 = new CompareToBug.CustomObject(3);
        CompareToBug.CustomObject obj3 = new CompareToBug.CustomObject(5);

        assertEquals(Integer.valueOf(1), CompareToBug.showBug(obj1, obj2)); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(Integer.valueOf(-1), CompareToBug.showBug(obj2, obj1)); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(Integer.valueOf(0), CompareToBug.showBug(obj1, obj3)); // TRIGGER BUG: "compareTo" results should not be checked for specific values
    }
}