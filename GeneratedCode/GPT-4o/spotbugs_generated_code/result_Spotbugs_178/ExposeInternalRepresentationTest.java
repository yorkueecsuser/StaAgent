import org.junit.Test;
import static org.junit.Assert.*;

public class ExposeInternalRepresentationTest {

    @Test
    public void testShowBug() {
        int[] externalData = {1, 2, 3};
        int[] result = ExposeInternalRepresentation.showBug(externalData);
        
        // TRIGGER BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        assertEquals("The first element of the array should have been changed to 999", 999, result[0]);
        
        // TRIGGER BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        assertEquals("The first element of the original array should have been changed to 999", 999, externalData[0]);
    }
}