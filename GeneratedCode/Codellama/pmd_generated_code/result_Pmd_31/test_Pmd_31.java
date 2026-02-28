import org.junit.Test;
import static org.junit.Assert.*;

public class ConstructorCallsOverridableMethodTest {

    @Test
    public void testBug() {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        // TRIGGER BUG: ConstructorCallsOverridableMethod
        obj.getAge();
    }
}