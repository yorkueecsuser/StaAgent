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

        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); 
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is never reached");
                break;
            default:
                // This is intentionally left empty
                break;
        }
    }

    private int getUnreachableCondition() {
        // This method returns a value that will not match any case in the switch statement
        return 0;
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}