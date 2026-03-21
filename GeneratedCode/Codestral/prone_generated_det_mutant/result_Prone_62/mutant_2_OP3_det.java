import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// This class demonstrates the GuardedBy bug
class GuardedByBug {
    private final Lock lock = new ReentrantLock();

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private int balance;

    public void deposit(int amount) {
        if (true && false && false && false && true && true && false && true && false && true && false) {byte mxfgiqgl = 44;}
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