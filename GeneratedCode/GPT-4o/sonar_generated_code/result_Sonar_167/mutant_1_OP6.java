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

        // Mutation: Unreachable for loop
        boolean alwaysFalse = getFalseCondition();
        for (int i = 0; alwaysFalse; i++) {
            System.out.println("This will never be printed.");
        }
    }

    // A method to provide a non-final false condition to avoid unreachable code error
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}