class ThreadRunBug {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
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
            // This is an unreachable if statement
            System.out.println("This line is unreachable.");
        }

        thread.run();
        return "Bug executed.";
    }
}