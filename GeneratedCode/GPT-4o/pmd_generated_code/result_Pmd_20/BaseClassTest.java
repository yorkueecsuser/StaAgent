import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class DerivedClassTest {

    @Test
    public void testShowBug() {
        DerivedClass example = new DerivedClass();
        List<String> result = example.showBug(); // TRIGGER BUG: CallSuperFirst

        // The test is expected to fail because the custom logic is executed before calling super.process()
        assertEquals("Expected base class processing to be executed first.", 
                     "Super process method was called last.", result.get(0));
    }
}