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

        // Unreachable if statement added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        }

        return "Thread created but not started"; // To demonstrate the bug
    }

    // Helper method to simulate an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}