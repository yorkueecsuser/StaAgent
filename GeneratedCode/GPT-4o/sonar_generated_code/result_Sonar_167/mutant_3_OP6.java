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

        // Insert unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print.");
        }

        // Incorrectly calling run() instead of start()
        thread.run();  // BUG: "Thread.run()" should not be called directly
    }

    private boolean getCondition() {
        return false;  // This ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}