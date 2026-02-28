import org.junit.Test;
import static org.junit.Assert.*;

public class SeniorClassTest {

    @Test
    public void testConstructorCallsOverridableMethod() {
        SeniorClass senior = new SeniorClass(); // TRIGGER BUG: ConstructorCallsOverridableMethod
        senior.showBug(); // This will also trigger the bug
    }
}