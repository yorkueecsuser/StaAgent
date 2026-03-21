import org.junit.Test;
import static org.junit.Assert.*;

public class BugGeneratorTest {

    @Test
    public void testShowBug() {
        BugGenerator bugGenerator = new BugGenerator();
        bugGenerator.showBug(); // TRIGGER BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

}