class BuggyThreads {
    private Object lock = new Object();
    private int deadStoreVariable;  // Added dead store variable

    public void showBug() {
        deadStoreVariable = 10;  // Using the dead store variable
        try {
            lock.wait();
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