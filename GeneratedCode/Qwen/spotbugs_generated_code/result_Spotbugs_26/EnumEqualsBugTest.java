import org.junit.Test;
import static org.junit.Assert.*;

public class EnumEqualsBugTest {

    @Test
    public void testShowBug() {
        EnumEqualsBug bugDemo = new EnumEqualsBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM) 
        assertEquals("color1.equals(color2): true, color1.equals(color3): false", result);
    }
}