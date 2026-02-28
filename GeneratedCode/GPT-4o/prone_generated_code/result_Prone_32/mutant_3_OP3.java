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
        
        // Unreachable if statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
        
        return "Thread created but not started"; // To demonstrate the bug
    }
    
    // Method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false; // This is where the condition is set to always be false
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}