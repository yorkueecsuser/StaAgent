import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class EIExposeRepBugTest {

    @Test 
    public void testShowBug() {
        EIExposeRepBug buggyObject = new EIExposeRepBug();
        buggyObject.addElement("Element1");
        List<String> list = buggyObject.showBug();
        list.add("Element2");
        assertEquals("Element2", list.get(1)); // TRIGGER BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }
}