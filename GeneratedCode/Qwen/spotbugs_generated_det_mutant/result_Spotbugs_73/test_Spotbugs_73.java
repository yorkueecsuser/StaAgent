import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsBugExampleTest {

    @Test
    public void testShowBug() {
        EqualsBugExample example = new EqualsBugExample();
        example.showBug(); // TRIGGER BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES) 
    }
}