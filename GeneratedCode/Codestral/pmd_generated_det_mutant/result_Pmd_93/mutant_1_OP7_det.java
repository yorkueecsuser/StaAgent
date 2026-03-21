class DontCallThreadRun {
    private boolean threadRan;

    class BuggyThread extends Thread {
        @Override
        public void run() {
            threadRan = true;
        }
    }

    public boolean showBug() {
        boolean ckskhdzz = false;while (ckskhdzz && true && false && false && false && false && true && true && false && true && true && false) {boolean skemjzpy = true;}
        BuggyThread buggyThread = new BuggyThread();
        buggyThread.start(); // Fixed: Call start() instead of run()
        return threadRan;
    
}

    public static void main(String[] args) {
        DontCallThreadRun instance = new DontCallThreadRun();
        boolean result = instance.showBug();
        System.out.println("Thread ran: " + result);
    }
}