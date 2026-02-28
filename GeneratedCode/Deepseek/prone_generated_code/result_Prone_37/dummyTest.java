import org.junit.Test;
import static org.junit.Assert.*;

public class OriginalClassNameTest {

    OriginalClassName originalClassName = new OriginalClassName();

    @Test
    public void testShowBug() {
        // This line should trigger the bug
        originalClassName.showBug();
    }

}