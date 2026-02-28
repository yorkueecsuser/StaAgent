import org.junit.Test;
import static org.junit.Assert.*;

public class StringRepresentationTest {

    @Test
    public void testShowBug() {
        StringRepresentation obj = new StringRepresentation("John Doe", 30);
        assertEquals("StringRepresentation{name='John Doe', age=30}", obj.showBug()); // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    }
}