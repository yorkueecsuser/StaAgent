class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.run();

        // Mutant code start
        boolean shouldRun = false;
        if (shouldRun) {
            // Empty block to make the if statement unreachable
        } else {
            System.out.println("This will never be executed");
        }
        // Mutant code end
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}