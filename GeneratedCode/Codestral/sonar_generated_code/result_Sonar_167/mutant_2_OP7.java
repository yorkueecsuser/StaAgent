class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly

        // Mutation: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }

        return "Bug executed.";
    }
}