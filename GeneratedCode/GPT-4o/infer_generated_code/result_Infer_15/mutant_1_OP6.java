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
        // Unreachable for loop added as a mutant
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This is an unreachable for-loop");
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
    
    // Method to ensure the for loop condition is dynamic
    private boolean getConditionForLoop() {
        return false;
    }
}