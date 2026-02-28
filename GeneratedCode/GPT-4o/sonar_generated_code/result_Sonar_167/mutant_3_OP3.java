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

        // Inserting an unreachable if statement
        boolean condition = checkCondition();
        if (condition) {
            System.out.println("This code is unreachable due to condition always being false.");
        }
    }

    private boolean checkCondition() {
        return false; // The condition method always returns false
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}