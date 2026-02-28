class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        int deadstore = 0; // Dead Store Mutation
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