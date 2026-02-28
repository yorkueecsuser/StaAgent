class BuggyThread {
    private boolean condition = false;

    public void showBug() {
        new Thread() {
            public void run() {
                // Mutant 1: Unreachable for loop insertion
                for (int i = 0; condition == false; i++) {
                    // This loop will never be executed because `condition` is always `false`
                }

                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}