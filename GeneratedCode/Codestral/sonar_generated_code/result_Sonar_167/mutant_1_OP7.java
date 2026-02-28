class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
                boolean unreachableCondition = getUnreachableCondition(); // Method call to get the unreachable condition
                while (unreachableCondition) { // Inserted unreachable while loop
                    System.out.println("This line should never be executed.");
                }
            }
        };
        thread.run();
        return "Bug executed.";
    }

    private boolean getUnreachableCondition() { // Method to always return false
        return false;
    }
}