import org.junit.Test;
import static org.junit.Assert.*;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GuardedByBugTest {
    @Test
    public void testDepositConcurrency() throws InterruptedException {
        GuardedByBug account = new GuardedByBug();
        int depositAmount = 100;

        // Create multiple threads to deposit money concurrently
        Thread t1 = new Thread(() -> account.deposit(depositAmount));
        Thread t2 = new Thread(() -> account.deposit(depositAmount));

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // The final balance should be the sum of all deposits made
        // However, since the bug is not guarding the balance field,
        // the final balance may not be as expected, triggering the bug
        // TRIGGER BUG: GuardedBy
        account.showBug();
    }
}

class GuardedByBug {
    private final Lock lock = new ReentrantLock();

    @GuardedBy("lock")
    private int balance;

    public void deposit(int amount) {
        setBalance(balance + amount); // BUG: GuardedBy - access to 'balance' not guarded by 'lock'.
    }

    private void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void showBug() {
        deposit(100);
        System.out.println(balance); // This could result in inconsistent or unexpected values
    }

    public static void main(String[] args) {
        GuardedByBug account = new GuardedByBug();
        account.showBug();
    }
}