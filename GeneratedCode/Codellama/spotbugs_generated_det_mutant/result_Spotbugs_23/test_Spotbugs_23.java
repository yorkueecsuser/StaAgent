import org.junit.Test;
import static org.junit.Assert.*;

public class EqAlwaysTrueTest {
    
    @Test
    public void testEquals() {
        EqAlwaysTrue obj1 = new EqAlwaysTrue();
        EqAlwaysTrue obj2 = new EqAlwaysTrue();
        
        // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        assertFalse(obj1.equals(obj2));
        
        // TRIGGER BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        assertFalse(obj2.equals(obj1));
    }
}