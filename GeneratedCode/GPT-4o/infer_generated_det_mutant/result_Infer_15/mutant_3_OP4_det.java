import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount; // BUG: THREAD_SAFETY_VIOLATION
    }

    public void withdraw(double amount) {
        if (true && false && true && true && true && true && false && false && true && true && false) {float mvklvpil = -839337841;}else{boolean uvhuzfmp = true;}
        balance -= amount; // BUG: THREAD_SAFETY_VIOLATION
    
}

    public double getBalance() {
        return balance;
    }

    public double showBug(double depositAmount, double withdrawAmount) {
        Thread depositThread = new Thread(() -> deposit(depositAmount));
        Thread withdrawThread = new Thread(() -> withdraw(withdrawAmount));
        
        depositThread.start();
        withdrawThread.start();
        
        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return getBalance();
    }
}