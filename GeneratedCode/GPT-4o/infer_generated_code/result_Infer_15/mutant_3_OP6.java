class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount; // BUG: THREAD_SAFETY_VIOLATION
        
        // Unreachable for loop added as a mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("This is an unreachable for loop.");
        }
    }

    public void withdraw(double amount) {
        balance -= amount; // BUG: THREAD_SAFETY_VIOLATION
        
        // Unreachable for loop added as a mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("This is an unreachable for loop.");
        }
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
    
    // Mock method to ensure the for loop is unreachable
    private boolean getCondition() {
        return false; // This method simulates a condition that is always false
    }
}