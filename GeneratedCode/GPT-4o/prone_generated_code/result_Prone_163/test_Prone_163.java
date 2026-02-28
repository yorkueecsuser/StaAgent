import org.junit.Test;
import static org.junit.Assert.*;

public class NullThrowExampleTest {

    @Test
    public void testShowBugTriggersThrowNull() {
        NullThrowExample example = new NullThrowExample();
        example.showBug(); // TRIGGER BUG: ThrowNull
    }
}