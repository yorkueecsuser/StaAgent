import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsHashCodeExampleTest {

    @Test
    public void testShowBug() {
        EqualsHashCodeExample example = new EqualsHashCodeExample(1, "Example");
        String result = example.showBug(); // TRIGGER BUG: EqualsHashCode
        assertEquals("example1.equals(example2): true\nexample1.hashCode(): " + example.hashCode() + "\nexample2.hashCode(): " + example.hashCode() + "\nSet size: 1\n", result);
    }
}