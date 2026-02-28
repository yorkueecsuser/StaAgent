import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ExampleTest {
    @Test
    public void testShowBug() {
        List<String> list = null;
        Example.showBug(list);
        // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }
}