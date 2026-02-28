import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentFactoryTest {

    @Test
    public void testCreate() {
        PaymentFactory paymentFactory = new PaymentFactory(new CreditService(), new AuthService());
        Payment payment = paymentFactory.create(new Date(1000000000L), new Date(1000000000L), new Money(10.0));
        // TRIGGER BUG: GuiceAssistedParameters
        assertEquals(new Date(1000000000L), payment.getStartDate());
        assertEquals(new Date(1000000000L), payment.getDueDate());
        assertEquals(10.0, payment.getAmount().getAmount(), 0.001);
    }
}