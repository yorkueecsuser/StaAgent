import org.junit.Test;
import static org.junit.Assert.*;

public class BitMaskBugTest {
    
    BitMaskBug bmb = new BitMaskBug();
    
    @Test
    public void testShowBug() {
        int e = 10;
        int C = 2;
        int D = 1;
        
        int result = bmb.showBug(e, C, D);
        
        assertEquals(0, result); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_AND)
    }
    
}