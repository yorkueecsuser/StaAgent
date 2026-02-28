class BuggyThreads {
    private Object lock = new Object();
    private boolean unreachableCondition = false;

    public void showBug() {
        try {
            // Inserting unreachable while loop
            while (unreachableCondition) {
                System.out.println("This is an unreachable loop!");
            }

            lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
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