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

        // Begin Mutation: Unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            System.out.println("This is an unreachable if statement.");
        }
        // End Mutation

        return getBalance();
    }
    
    // Helper method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }
}