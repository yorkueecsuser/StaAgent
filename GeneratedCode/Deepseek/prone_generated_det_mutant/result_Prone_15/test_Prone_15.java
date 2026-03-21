import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class BundleDeserializationCastTest {

    @Test
    public void triggerBug() throws Exception {
        Object obj = BundleDeserializationCast.showBug();
        // TRIGGER BUG: BundleDeserializationCast
        assertEquals(int.class, obj.getClass()); // Fails because Long is returned, not int
    }
}