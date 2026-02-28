import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class GuiceAssistedParametersExampleTest {

    @Test
    public void testShowBug() {
        GuiceAssistedParametersExample example = new GuiceAssistedParametersExample();
        Date startDate = new Date();
        Date dueDate = new Date(System.currentTimeMillis() + 86400000L); // 1 day later

        // This will trigger the bug due to the lack of named @Assisted annotations
        GuiceAssistedParametersExample.RealPayment payment = example.showBug(startDate, dueDate, 100.0); // TRIGGER BUG: GuiceAssistedParameters

        // Assert to make sure the test fails to highlight the bug
        assertNotNull(payment.toString()); // TRIGGER BUG: GuiceAssistedParameters
    }
}