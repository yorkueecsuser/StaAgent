class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        try {
            lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This line will never be executed.");
        }

        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread = new Thread(buggyThreads::showBug);
        thread.start();
    }
}