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
        
        // Unreachable switch statement mutant added
        boolean condition = getCondition();
        switch (condition ? 1 : 2) {
            case 3:
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }
        
        return getBalance();
    }

    // Helper method to dynamically determine the condition
    private boolean getCondition() {
        return false; // Ensures the switch case is unreachable
    }
}