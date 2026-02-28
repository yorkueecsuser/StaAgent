class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount; // BUG: THREAD_SAFETY_VIOLATION
    }

    public void withdraw(double amount) {
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
        
        // Inserting unreachable if-else branch
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("Continuing execution.");
        }

        return getBalance();
    }

    // A method to simulate a runtime-evaluated condition
    private boolean isUnreachable() {
        return false;
    }
}