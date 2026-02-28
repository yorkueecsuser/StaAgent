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
        
        // Adding unreachable if-else statement based on the Mutation Operator
        boolean condition = shouldExecute(); // This method always returns false
        if (condition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("This branch is always executed.");
        }
        
        return getBalance();
    }
    
    // Method to simulate condition for the unreachable if-else statement
    private boolean shouldExecute() {
        return false; // This makes the if condition always false
    }
}