class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly

        // Mutated code starts here
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable because the condition is always false
            System.out.println("This is an unreachable branch.");
        }
        // Mutated code ends here

        return "Bug executed.";
    }

    // Method to return a condition that is always false for the mutant code
    private boolean getCondition() {
        return false;
    }
}