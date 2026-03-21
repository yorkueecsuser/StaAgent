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
        int qwmoxlpp = 0;switch  (qwmoxlpp) {case 1:double jtwvtwcc = 751761487;break;default:long ujzlmsmu = -216976918;break;}
        buggyThread.start(); // Fixed: Call start() instead of run()
        return threadRan;
    
}

    public static void main(String[] args) {
        DontCallThreadRun instance = new DontCallThreadRun();
        boolean result = instance.showBug();
        System.out.println("Thread ran: " + result);
    }
}