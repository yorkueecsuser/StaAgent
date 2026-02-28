class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run(); // BUG: "Thread.run()" should not be called directly

        // Mutant Code: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 0:
                System.out.println("Unreachable code.");
                break;
        }

        return "Bug executed.";
    }

    // Dummy method to make sure the code compiles
    private int getValue() {
        return 1; // This is always greater than 0, making the switch case unreachable
    }
}