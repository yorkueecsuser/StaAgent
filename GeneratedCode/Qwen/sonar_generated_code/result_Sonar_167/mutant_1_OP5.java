class ThreadRunBugExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This is the reachable case
                System.out.println("This is the reachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the first case of the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}