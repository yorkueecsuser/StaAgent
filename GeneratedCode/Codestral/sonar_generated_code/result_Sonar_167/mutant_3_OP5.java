class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                int value = getUnreachableValue(); // Non-final variable used for switch condition
                switch(value) {
                    case 1: // Unreachable case
                        System.out.println("This is an unreachable switch case.");
                        break;
                }
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly
        return "Bug executed.";
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not 1, ensuring the case is unreachable
    }
}