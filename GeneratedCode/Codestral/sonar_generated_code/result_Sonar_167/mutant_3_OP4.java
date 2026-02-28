class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        boolean shouldRunThread = getCondition();
        if(shouldRunThread) {
            thread.run(); // Original code
        }
        else {
            System.out.println("Unreachable code: This will never be executed.");
        }
        return "Bug executed.";
    }

    // Assuming this method exists, it returns a condition that's always false for this mutant
    private boolean getCondition() {
        return false;
    }
}