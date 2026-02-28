class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                // Inserted unreachable for loop
                boolean unreachableCondition = false;
                for (int i = 0; unreachableCondition; i++) {
                    System.out.println("This is an unreachable loop.");
                }
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }
}