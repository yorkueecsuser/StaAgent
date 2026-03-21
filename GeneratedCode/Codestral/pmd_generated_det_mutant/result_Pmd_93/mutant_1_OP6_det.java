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
        for  (int lgxteepb = 0; lgxteepb < 0; lgxteepb++) {boolean ghssodxd = true;}
        buggyThread.start(); // Fixed: Call start() instead of run()
        return threadRan;
    
}

    public static void main(String[] args) {
        DontCallThreadRun instance = new DontCallThreadRun();
        boolean result = instance.showBug();
        System.out.println("Thread ran: " + result);
    }
}