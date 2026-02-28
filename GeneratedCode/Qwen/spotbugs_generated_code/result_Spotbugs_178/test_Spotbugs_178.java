import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class ExposeRepExampleTest {

    @Test
    public void testConstructorAndGetter() {
        Date initialDate = new Date();
        ExposeRepExample example = new ExposeRepExample(initialDate);
        Date retrievedDate = example.getDate(); // TRIGGER BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 

        // Modify the external date
        initialDate.setTime(0); // Setting to epoch time
        assertEquals("Date in example should have changed due to mutable reference", new Date(0), retrievedDate);
    }

    @Test
    public void testShowBugMethod() {
        Date initialDate = new Date();
        ExposeRepExample example = new ExposeRepExample(initialDate);
        Date newDate = new Date(1000);

        example.showBug(newDate); // TRIGGER BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        Date retrievedDate = example.getDate();

        // Modify the newDate
        newDate.setTime(2000);
        assertEquals("Date in example should have changed due to mutable reference", new Date(2000), retrievedDate);
    }
}