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
        // Unreachable while loop inserted below
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never print");
        }
        return "Thread created but not started"; // To demonstrate the bug
    }

    // Method to ensure the condition is dynamic and not a compile-time constant
    private boolean getCondition() {
        return false; // The condition will always be false at runtime
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}