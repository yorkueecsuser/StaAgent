import org.junit.Test;
import static org.junit.Assert.*;

public class ReversedArgumentsBugTest {

    @Test
    public void testShowBug() {
        String message = "Hello, World!";
        // TRIGGER BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        ReversedArgumentsBug.showBug();
    }
}