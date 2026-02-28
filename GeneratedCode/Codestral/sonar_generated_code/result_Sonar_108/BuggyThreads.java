class BuggyThreads {
    private Object lock = new Object();

    // Method to return a false condition for the unreachable while loop
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        try {
            // Inserted unreachable while loop
            while (getFalseCondition()) {
                System.out.println("This is an unreachable while loop");
            }
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