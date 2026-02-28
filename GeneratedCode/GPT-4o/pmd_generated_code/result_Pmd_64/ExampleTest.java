import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testShowBug() {
        Example example = new Example(1, "Example");
        example.showBug(); // TRIGGER BUG: OverrideBothEqualsAndHashcode
    }
}