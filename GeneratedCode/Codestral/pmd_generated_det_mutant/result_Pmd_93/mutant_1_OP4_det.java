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
        if (false && false && false && false && false && true && true && false && false && true && false) {byte xsddhzxv = -86;}else{double lufyfrpr = -987135975;}
        buggyThread.start(); // Fixed: Call start() instead of run()
        return threadRan;
    
}

    public static void main(String[] args) {
        DontCallThreadRun instance = new DontCallThreadRun();
        boolean result = instance.showBug();
        System.out.println("Thread ran: " + result);
    }
}