class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        // The thread is created but never started
        
        // Unreachable if-else statement added for mutation
        boolean condition = getDynamicCondition();
        if (condition) {
            System.out.println("This branch is never reached");
        } else {
            System.out.println("This is the else branch");
        }
        
        return "Thread created but not started"; // To demonstrate the bug
    }
    
    // Method to simulate a runtime condition
    private boolean getDynamicCondition() {
        return false; // This makes the if condition effectively false at runtime
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}