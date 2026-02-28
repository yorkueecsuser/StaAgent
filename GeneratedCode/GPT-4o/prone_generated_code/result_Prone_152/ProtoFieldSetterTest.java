import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoFieldSetterTest {
    
    @Test
    public void testShowBug() {
        ProtoFieldSetter setter = new ProtoFieldSetter();
        setter.showBug(); // TRIGGER BUG: SetUnrecognized
    }
}