class BuggyThreads {
    private Object lock = new Object();

    private boolean getCondition() { return false; } // Method to return a false condition

    public void showBug() {
        try {
            lock.wait();
            if (getCondition()) { // Unreachable if statement as per mutation operator
                System.out.println("This line should be unreachable.");
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