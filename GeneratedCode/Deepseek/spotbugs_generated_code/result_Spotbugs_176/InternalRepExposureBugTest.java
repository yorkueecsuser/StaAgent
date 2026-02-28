import org.junit.Test;
import static org.junit.Assert.*;

public class InternalRepExposureBugTest {

    @Test
    public void testShowBug() {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100; // TRIGGER BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        assertEquals(initialData[0], returnedData[0]); // This assertion will fail, indicating that the internal representation has been exposed
    }
}