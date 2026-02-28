class ThreadRunBug {
    public String showBug() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        t.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }
}