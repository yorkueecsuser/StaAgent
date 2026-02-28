class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
                // Adding unreachable for loop
                for (int i = 0; getCondition(); i++) {
                    System.out.println("Unreachable for loop");
                }
            }
        };
        thread.run();
        return "Bug executed.";
    }

    // Dynamic condition to ensure the loop is unreachable
    private boolean getCondition() {
        return false;
    }
}