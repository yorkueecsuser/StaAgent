class BuggyThreads {
    private Object lock_a = new Object(); // Mutant: Renamed 'lock' to 'lock_a'

    public void showBug() {
        try {
            lock_a.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread_b = new Thread(buggyThreads::showBug); // Mutant: Renamed 'thread' to 'thread_b'
        thread_b.start();
    }
}