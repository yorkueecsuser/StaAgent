class BuggyThreads {
    private Object lock = new Object();
    private boolean getFalseCondition() { return false; }

    public void showBug() {
        try {
            lock.wait();
            int value = 0;
            boolean shouldRun = getFalseCondition();
            if(shouldRun) {
                switch(value) {
                    case 1:
                        // This case is unreachable as value is always 0 and shouldRun is always false
                        System.out.println("Unreachable case");
                        break;
                }
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