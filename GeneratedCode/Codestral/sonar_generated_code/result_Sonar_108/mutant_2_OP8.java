class BuggyThreads {
    private Object lock_r = new Object();

    public void showBug() {
        try {
            lock_r.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads_r = new BuggyThreads();
        Thread thread_r = new Thread(buggyThreads_r::showBug);
        thread_r.start();
    }
}