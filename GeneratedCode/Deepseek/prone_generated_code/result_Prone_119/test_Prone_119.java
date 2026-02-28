import org.junit.Test;
import static org.junit.Assert.*;

public class NonFinalCompileTimeConstantTest {
    NonFinalCompileTimeConstant nfcc = new NonFinalCompileTimeConstant();

    @Test 
    public void testShowBug() {
        assertEquals("old value", nfcc.showBug()); // TRIGGER BUG: NonFinalCompileTimeConstant
    }
}