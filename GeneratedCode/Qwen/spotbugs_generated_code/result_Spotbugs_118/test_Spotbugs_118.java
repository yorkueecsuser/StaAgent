import org.junit.Test;
import static org.junit.Assert.*;

public class NullInstanceofExampleTest {

    @Test
    public void testShowBug() {
        NullInstanceofExample example = new NullInstanceofExample();
        assertFalse(example.showBug()); // TRIGGER BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 
    }
}