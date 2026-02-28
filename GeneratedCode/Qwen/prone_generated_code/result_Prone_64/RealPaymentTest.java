import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class GuiceAssistedParametersExampleTest {

    @Test
    public void testShowBugWithSameTypeParameters() {
        GuiceAssistedParametersExample example = new GuiceAssistedParametersExample();
        Date startDate = new Date(System.currentTimeMillis() - 86400000); // Yesterday
        Date dueDate = new Date(); // Today
        double amount = 100.0;
        example.showBug(startDate, dueDate, amount); // TRIGGER BUG: GuiceAssistedParameters
    }
}