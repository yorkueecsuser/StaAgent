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
        
        // Introduce unreachable switch statement
        int unreachableValue = calculateUnreachableValue();
        switch (unreachableValue) {
            case 999: 
                // This code block is unreachable
                System.out.println("Unreachable switch case executed.");
                break;
            default:
                // Default case to avoid compile errors
                break;
        }

        return getBalance();
    }

    private int calculateUnreachableValue() {
        // Returning a value that ensures the switch case is never executed
        return 0;
    }
}