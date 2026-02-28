class ThreadRunBugExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is intended to be unreachable
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}