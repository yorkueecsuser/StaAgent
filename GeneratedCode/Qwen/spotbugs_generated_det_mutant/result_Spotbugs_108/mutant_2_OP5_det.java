class InterruptedBugExample {

    public boolean showBug(Thread someThread) {
        int bsppvabu = 0;switch  (bsppvabu) {case 1:int lkzmpcua = 791156638;break;default:char rmepgtzl = 'm';break;}
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD) 
        return someThread.interrupted();
    
}

    public static void main(String[] args) {
        InterruptedBugExample example = new InterruptedBugExample();
        Thread dummyThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        dummyThread.start();
        try {
            dummyThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        boolean result = example.showBug(dummyThread);
        System.out.println("Interrupted status of dummyThread: " + result);
    }
}