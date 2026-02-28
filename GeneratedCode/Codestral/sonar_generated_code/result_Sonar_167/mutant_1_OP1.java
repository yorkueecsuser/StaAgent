class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        int unusedVar = 10; //Dead Store: Inserting an unused variable declaration
        thread.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }
}