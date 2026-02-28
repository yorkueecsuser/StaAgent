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

        // Unreachable if-else statement
        boolean condition = getCondition(); // Method that always returns false
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the else part of an unreachable if-else statement.");
        }
    }

    // Method that returns a non-final boolean, simulating a runtime condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}