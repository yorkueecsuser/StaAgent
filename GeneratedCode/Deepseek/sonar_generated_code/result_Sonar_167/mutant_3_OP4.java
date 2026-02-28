class BuggyThread {

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        new Thread() {
            public void run() {
                // Mutant code: Adding an unreachable 'if' statement
                if (false) {
                    System.out.println("This is executed in a new thread (mutant - 1)");
                }

                System.out.println("This is executed in a new thread");
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}