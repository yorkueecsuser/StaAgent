import org.junit.Test;
import static org.junit.Assert.*;

public class NM_METHOD_CONSTRUCTOR_CONFUSIONTest {
    @Test
    public void testBug() {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.showBug();
        fail("This method should have been a constructor"); // TRIGGER BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    }
}