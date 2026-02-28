class BuggyThreads {
    private Object lock = new Object();

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        try {
            for (int i = 0; getFalseCondition(); i++) { // mutant: unreachable for loop
                System.out.println("This line will never be executed.");
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