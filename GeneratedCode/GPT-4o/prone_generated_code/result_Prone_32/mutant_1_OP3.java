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

        // Introducing a non-final variable for unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block");
        }

        return "Thread created but not started"; // To demonstrate the bug
    }

    // Method to simulate a dynamically determined condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}