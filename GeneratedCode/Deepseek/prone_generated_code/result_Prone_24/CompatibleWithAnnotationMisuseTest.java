import org.junit.Test;
import static org.junit.Assert.*;

public class CompatibleWithAnnotationMisuseTest {

    @Test
    public void testShowBug() {
        // This should fail as the @CompatibleWith annotation is not correctly used
        CompatibleWithAnnotationMisuse.showBug("test");
        // TRIGGER BUG: CompatibleWithAnnotationMisuse
    }
}