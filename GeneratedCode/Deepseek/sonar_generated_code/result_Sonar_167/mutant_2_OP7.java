class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");

                // Mutant
                boolean condition = true;
                while(condition) {
                    condition = false; // This line makes the while loop unreachable
                }
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}