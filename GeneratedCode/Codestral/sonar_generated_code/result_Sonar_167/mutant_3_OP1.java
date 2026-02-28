class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        String deadStoreVar = "unusedVariable"; // Dead store inserted here
        thread.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }
}