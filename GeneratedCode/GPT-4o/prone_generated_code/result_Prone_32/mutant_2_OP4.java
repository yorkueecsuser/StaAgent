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
        
        // Inserted unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This else branch is also unreachable");
        }
        
        return "Thread created but not started"; // To demonstrate the bug
    }
    
    // Method to simulate a dynamic runtime condition that is always false
    private boolean getUnreachableCondition() {
        return false; // This simulates an unreachable condition
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}