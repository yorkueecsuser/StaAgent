class DontCallThreadRun {
    private boolean threadRan;

    class BuggyThread extends Thread {
        @Override
        public void run() {
            threadRan = true;
        }
    }
public boolean showBug() {
    BuggyThread buggyThread = new BuggyThread();
    buggyThread = new BuggyThread();
    buggyThread.start();
    return threadRan;
}

    public static void main(String[] args) {
        DontCallThreadRun instance = new DontCallThreadRun();
        boolean result = instance.showBug();
        System.out.println("Thread ran: " + result);
    }
}