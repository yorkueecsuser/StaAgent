class ThreadRunBugExample {

    static class ExampleRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }

    private int getUnreachableValue() {
        return 3; // This can be changed at runtime to affect the switch statement
    }

    public void showBug() {
        ExampleRunnable exampleRunnable = new ExampleRunnable();
        Thread thread = new Thread(exampleRunnable);

        // Incorrectly calling run() instead of start()
        thread.run();  // BUG: "Thread.run()" should not be called directly

        // Inserting an unreachable switch statement
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 0:
                System.out.println("This case is unreachable.");
                break;
            case 1:
                System.out.println("This case is also unreachable.");
                break;
            // Default case is effectively unreachable with current getUnreachableValue() return
            default:
                break;
        }
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}