import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterExampleTest {

    @Test
    public void testShowBug() {
        NullParameterExample example = new NullParameterExample();
        example.showBug(); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }
}