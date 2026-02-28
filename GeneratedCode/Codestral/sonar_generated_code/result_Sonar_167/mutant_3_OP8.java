class ThreadRunBug {
    public String showBug() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly
        t.run(); // Mutant: trying to run the thread with the new name
        return "Bug executed.";
    }
}