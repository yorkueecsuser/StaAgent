import org.junit.Test;
import static org.junit.Assert.*;

class ExampleTest {
    @Test
    public void testBug() {
        Example ex = new Example();
        ex.setValue(10);
        ex.setValue2(20);
        assertEquals(10, ex.getValue());
        assertEquals(20, ex.getValue2());
        ex.setValue(100);
        ex.setValue2(200);
        assertEquals(100, ex.getValue()); // TRIGGER BUG: Getters and setters should be synchronized in pairs
        assertEquals(200, ex.getValue2());
    }
}