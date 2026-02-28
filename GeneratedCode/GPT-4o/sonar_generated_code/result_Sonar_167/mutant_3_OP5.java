class ThreadRunBugExample {

    static class ExampleRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }

    public void showBug() {
        ExampleRunnable exampleRunnable = new ExampleRunnable();
        Thread thread = new Thread(exampleRunnable);

        // Incorrectly calling run() instead of start()
        thread.run();  // BUG: "Thread.run()" should not be called directly

        // Inserted unreachable switch statement
        int unreachableSwitchCondition = getUnreachableValue(); // Dynamically determined condition
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                // Ensures the switch is unreachable
                break;
        }
    }

    private int getUnreachableValue() {
        // This method returns a value that is not targeted by any case statement
        return 2;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}