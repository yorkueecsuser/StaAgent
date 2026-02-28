class BuggyThreads {
    private Object lock = new Object();

    private int getUnreachableValue() {
        return -1;
    }

    public void showBug() {
        try {
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("This line will never be executed");
                    break;
                default:
                    lock.wait();
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