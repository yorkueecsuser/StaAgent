class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // Mutated code with an unreachable if statement
                boolean condition = false;
                if (!condition) {
                    System.out.println("This will never be executed");
                } else {
                    System.out.println("This is executed in a new thread");
                }
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}