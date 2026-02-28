class BuggyThreads {
    private Object lk = new Object();  // Mutated code: Renamed 'lock' to 'lk'

    public void showBug() {
        try {
            lk.wait(); // Updated 'lock' to 'lk'
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