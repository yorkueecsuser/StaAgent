class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                if (false) { // This is an unreachable if statement
                    // This code can never be executed
                    System.out.println("This is unreachable");
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