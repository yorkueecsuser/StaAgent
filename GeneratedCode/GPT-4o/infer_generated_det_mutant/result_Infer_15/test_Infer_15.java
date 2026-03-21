import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testShowBug() {
        BankAccount account = new BankAccount(100.0);
        double result = account.showBug(50.0, 30.0); // TRIGGER BUG: THREAD_SAFETY_VIOLATION
        
        // The expected balance should be 120.0, but due to the thread safety violation,
        // the result may vary, leading to a test failure.
        assertEquals(120.0, result, 0.0); // TRIGGER BUG: THREAD_SAFETY_VIOLATION
    }

    @Test
    public void testShowBugWithZeroBalance() {
        BankAccount account = new BankAccount(0.0);
        double result = account.showBug(100.0, 50.0); // TRIGGER BUG: THREAD_SAFETY_VIOLATION
        
        // The expected balance should be 50.0, but due to the thread safety violation,
        // the result may vary, leading to a test failure.
        assertEquals(50.0, result, 0.0); // TRIGGER BUG: THREAD_SAFETY_VIOLATION
    }
}