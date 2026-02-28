class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait();
            lock = lock;  // Mutant: Duplication of the assignment statement 'lock = lock;'
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