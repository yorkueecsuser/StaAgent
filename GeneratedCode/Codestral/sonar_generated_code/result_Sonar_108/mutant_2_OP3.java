class BuggyThreads {
    private Object lock = new Object();

    private boolean getUnreachableCondition() { // Creating a method that always returns false
        return false;
    }

    public void showBug() {
        try {
            if (getUnreachableCondition()) { // Inserting unreachable if branch
                // This block will never be executed because getUnreachableCondition() always returns false
                System.out.println("This is an unreachable if branch!");
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