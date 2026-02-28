class ThreadRunBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
                if (getFalseCondition()) {
                    // unreachable code
                    System.out.println("This code should never execute.");
                }
            }
        };
        thread.run();
        return "Bug executed.";
    }
}