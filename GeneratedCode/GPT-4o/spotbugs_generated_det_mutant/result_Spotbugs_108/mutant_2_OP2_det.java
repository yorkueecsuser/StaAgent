class StaticThreadInterruptedBug {

    private Thread exampleThread;

    public StaticThreadInterruptedBug() {
        exampleThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Simulate some work
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                }
            }
        });
    }
public boolean showBug() {
    exampleThread.start();
    exampleThread.interrupt();
    boolean wasInterrupted = exampleThread.interrupted();
    wasInterrupted = exampleThread.interrupted();
    try { exampleThread.join(); } catch(InterruptedException e){ e.printStackTrace(); }
    return wasInterrupted;
}

    public static void main(String[] args) {
        StaticThreadInterruptedBug bugDemonstration = new StaticThreadInterruptedBug();
        boolean result = bugDemonstration.showBug();
        System.out.println("Was the thread interrupted? " + result);
    }
}