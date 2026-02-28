class ThreadRunBugExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never print because shouldRun is always false.");
        } else {
            System.out.println("This will also never print because shouldRun is always false.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}