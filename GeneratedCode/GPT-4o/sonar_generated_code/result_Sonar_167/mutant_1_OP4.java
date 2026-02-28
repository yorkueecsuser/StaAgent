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

        // Unreachable if-else statement added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            // Original incorrect call to run()
            thread.run();  // BUG: "Thread.run()" should not be called directly
        }
    }

    // Method to provide a dynamically false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}