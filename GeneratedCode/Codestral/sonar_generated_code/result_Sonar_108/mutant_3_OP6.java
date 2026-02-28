class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        boolean unreachableCondition = false;
        try {
            for (int i = 0; unreachableCondition; i++) {
                // Unreachable for loop inserted here
            }
            lock.wait(); // Original code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread = new Thread(buggyThreads::showBug);
        thread.start();
    }
}