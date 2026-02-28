class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
                boolean unreachableCondition = getCondition();   // Added mutant: unreachable while loop
                while (unreachableCondition) {                   // This loop is unreachable as the condition is always false
                    System.out.println("This line will never execute.");
                }
            }
        };
        thread.run();
        return "Bug executed.";
    }

    private boolean getCondition() {
        return false;  // Always return false to make the loop unreachable
    }
}