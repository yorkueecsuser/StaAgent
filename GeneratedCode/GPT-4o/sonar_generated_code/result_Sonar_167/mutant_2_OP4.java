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

        // Inserted unreachable if-else statement
        boolean isUnreachable = getRuntimeCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is also unreachable.");
        }
    }

    // Method to simulate a runtime condition that is always false
    private boolean getRuntimeCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}