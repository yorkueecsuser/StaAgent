class BuggyThreads {
    private Object lock = new Object();

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        try {
            lock.wait();
            if (getUnreachableCondition()) {
                System.out.println("This code is unreachable");
            } else {
                System.out.println("This code is always executed");
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