class ThreadRunBugExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly

        // Mutant code starts here
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is a reachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        return true; // This ensures the if block is reachable and the else block is unreachable
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}