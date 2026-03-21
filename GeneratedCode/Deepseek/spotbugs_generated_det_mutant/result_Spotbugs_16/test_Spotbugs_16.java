import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testBug() throws NoSuchFieldException {
        Main main = new Main();

        // TRIGGER BUG: Dm: Cannot use reflection to check for presence of annotation without runtime retention (DMI_ANNOTATION_IS_NOT_VISIBLE_TO_REFLECTION)
        main.showBug();
    }
}