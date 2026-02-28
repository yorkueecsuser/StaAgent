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
        
        return getBalance();
    }
    
    // Mutated Code
    private double b;
    
    public BankAccount(double initial) {
        this.b = initial;
    }

    public void dep(double amt) {
        b += amt;
    }

    public void with(double amt) {
        b -= amt;
    }

    public double getBal() {
        return b;
    }

    public double showBugMutant(double depAmount, double withAmount) {
        Thread depThread = new Thread(() -> dep(depAmount));
        Thread withThread = new Thread(() -> with(withAmount));
        
        depThread.start();
        withThread.start();
        
        try {
            depThread.join();
            withThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return getBal();
    }
}