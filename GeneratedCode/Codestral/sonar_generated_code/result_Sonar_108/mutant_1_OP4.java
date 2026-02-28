class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait();
            boolean shouldRun = getCondition();
            if (shouldRun) {  // Unreachable if-else statement
                System.out.println("This statement will never be executed.");
            } else {
                System.out.println("This is the unreachable else branch.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false;  // This ensures the if-statement condition is always false
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread = new Thread(buggyThreads::showBug);
        thread.start();
    }
}