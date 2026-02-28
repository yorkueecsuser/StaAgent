class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // Original code
        thread.run(); // Mutated code (duplication of the above line)
        return "Bug executed.";
    }
}