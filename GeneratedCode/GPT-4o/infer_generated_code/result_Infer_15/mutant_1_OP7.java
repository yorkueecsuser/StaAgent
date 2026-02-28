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
        // Unreachable while loop mutation
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This while loop is unreachable.");
        }
        
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
    
    // Method to provide a dynamic condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }
}