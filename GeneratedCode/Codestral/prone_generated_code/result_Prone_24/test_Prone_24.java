import org.junit.Test;
import static org.junit.Assert.*;

public class CompatibleWithAnnotationMisuseTest {

    @Test
    public void testConvertToImmutable() {
        CompatibleWithAnnotationMisuse buggyClass = new CompatibleWithAnnotationMisuse();
        Object obj = new Object(); // TRIGGER BUG: CompatibleWithAnnotationMisuse
        buggyClass.showBug(obj); // This line should throw an IllegalArgumentException
    }
}