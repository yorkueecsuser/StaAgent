import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldTest {
    
    @Test
    public void testShowBug() {
        UnwrittenField unwrittenField = new UnwrittenField("John Doe", 30);
        assertEquals("My name is John Doe and I am 30 years old.", unwrittenField.showBug()); // TRIGGER BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }
}