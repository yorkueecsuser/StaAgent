class ThreadRunBug {
    public String showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) { // Unreachable if statement inserted
            System.out.println("This is an unreachable branch.");
        }
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }
}