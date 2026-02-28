class BuggyThreads {
    private Object lock = new Object();
    private Object duplicateLock = new Object(); // Added duplicate variable

    public void showBug() {
        try {
            lock.wait();
            duplicateLock = lock; // Mutant code: Duplicated assignment statement
            duplicateLock.wait(); // BUG: "Object.wait()" should only be called from synchronized code
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