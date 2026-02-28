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
        
        // This is where the bug occurs - invoking the static method on an instance
        boolean wasInterrupted = exampleThread.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        
        // Unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case to avoid unreachable statement error
                break;
        }

        try {
            exampleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return wasInterrupted;
    }

    private int getUnreachableCondition() {
        // This method dynamically returns a condition that makes the switch unreachable
        return 0; // Always returns 0, so switch case 1 is never reached
    }

    public static void main(String[] args) {
        StaticThreadInterruptedBug bugDemonstration = new StaticThreadInterruptedBug();
        boolean result = bugDemonstration.showBug();
        System.out.println("Was the thread interrupted? " + result);
    }
}