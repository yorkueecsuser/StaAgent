import org.junit.Test;
import static org.junit.Assert.*;

public class ExposeInternalRepresentationTest {

    @Test
    public void testShowBug() {
        ExposeInternalRepresentation example = new ExposeInternalRepresentation();
        assertEquals("Initial Value", example.getInternalList().get(0)); // TRIGGER BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        example.showBug();
        assertEquals("Modified Value", example.getInternalList().get(1)); // TRIGGER BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }
}