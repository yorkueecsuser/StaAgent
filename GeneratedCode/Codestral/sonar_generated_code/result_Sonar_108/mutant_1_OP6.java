class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        boolean shouldWait = getCondition();
        if (shouldWait) { // Mutant Code: Unreachable for loop
            for (int i = 0; false; i++) { /* Unreachable code */ }
        }
        try {
            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread = new Thread(buggyThreads::showBug);
        thread.start();
    }
}