class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // BUG: "Thread.run()" should not be called directly
                System.out.println("This is executed in a new thread");
            }
        }.run();

        // Mutated code: Dead Store
        String uselessVar = "useless";
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}