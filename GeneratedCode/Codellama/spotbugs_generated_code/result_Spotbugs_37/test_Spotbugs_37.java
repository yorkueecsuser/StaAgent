import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testHashCode() {
        MyClass myClass = new MyClass(1, 2);
        int expectedHashCode = 2;
        int actualHashCode = myClass.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testShowBug() {
        MyClass myClass = new MyClass(1, 2);
        int expectedHashCode = 2;
        int actualHashCode = myClass.hashCode();
        assertNotEquals(expectedHashCode, actualHashCode);
    }
}