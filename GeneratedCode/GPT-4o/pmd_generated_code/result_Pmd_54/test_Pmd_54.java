import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusingClassTest {

    @Test
    public void testShowBug() {
        ConfusingClass example = new ConfusingClass();
        example.showBug(); // TRIGGER BUG: MethodWithSameNameAsEnclosingClass
    }
}