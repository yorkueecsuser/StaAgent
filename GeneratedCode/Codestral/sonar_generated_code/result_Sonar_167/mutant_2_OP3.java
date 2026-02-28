class ThreadRunBug {
    // Method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };

        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This line should not be executed.");
        }

        thread.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }
}