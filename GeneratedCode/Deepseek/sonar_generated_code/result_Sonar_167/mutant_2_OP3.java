class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                // Mutation: The if statement becomes unreachable as the condition is always false.
                if (getCondition()) {
                    System.out.println("This is executed in a new thread");
                }
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }

    // New method that always returns false
    public boolean getCondition() {
        return false;
    }
}