import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class RealPaymentTest {
    public interface PaymentFactory {
        Payment create(Date startDate, Date dueDate, Money amount);
    }

    class Money {}
    class CreditService {}
    class AuthService {}
    interface Payment {}

    class RealPayment implements Payment {
        public RealPayment(CreditService creditService, AuthService authService, Date startDate, Date dueDate, Money amount) {}

        public static Payment showBug(PaymentFactory factory, Date startDate, Date dueDate, Money amount) {
            Payment payment = factory.create(startDate, dueDate, amount);
            return payment;
        }
    }

    @Test
    public void showBugTest() {
        PaymentFactory factory = new PaymentFactory() {
            @Override
            public Payment create(Date startDate, Date dueDate, Money amount) {
                return new RealPayment(null, null, startDate, dueDate, amount);
            }
        };

        Date startDate = new Date();
        Date dueDate = new Date();
        Money amount = new Money();

        Payment payment = RealPayment.showBug(factory, startDate, dueDate, amount);

        assertNotNull(payment);
    }
}