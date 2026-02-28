class BuggyThreads {
    private Object lock = new Object();
    private boolean unreachableCondition() { return false; } // Method to return a false condition

    public void showBug() {
        try {
            lock.wait();
            if (unreachableCondition()) { // Inserting an unreachable if branch
                System.out.println("This line will never be executed");
            }
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