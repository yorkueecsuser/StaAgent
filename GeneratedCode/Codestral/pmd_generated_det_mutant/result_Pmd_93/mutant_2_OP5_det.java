class DontCallThreadRun {
    private boolean threadRan;

    class BuggyThread extends Thread {
        @Override
        public void run() {
            threadRan = true;
        }
    }

    public boolean showBug() {
        int xbvyxyqu = 0;switch  (xbvyxyqu) {case 1:boolean qbfvhkyo = true;break;default:double eqzaytax = 994213272;break;}
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