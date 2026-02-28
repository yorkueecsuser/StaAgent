class BuggyThreads {
    private Object lock = new Object();

    public void showBug() {
        boolean condition = false;
        try {
            lock.wait();
            // Mutant: unreachable switch statement
            switch (getCondition()) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getCondition() {
        return 0;
    }

    public static void main(String[] args) {
        BuggyThreads buggyThreads = new BuggyThreads();
        Thread thread = new Thread(buggyThreads::showBug);
        thread.start();
    }
}