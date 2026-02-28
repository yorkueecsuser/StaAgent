class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable due to the condition being false
            System.out.println("This should never run");
        }

        // BUG: DeadThread
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    }

    // Method to return false for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}