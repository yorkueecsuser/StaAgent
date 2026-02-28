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
        
        try {
            exampleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("This is unreachable code");
        }

        return wasInterrupted;
    }
    
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        StaticThreadInterruptedBug bugDemonstration = new StaticThreadInterruptedBug();
        boolean result = bugDemonstration.showBug();
        System.out.println("Was the thread interrupted? " + result);
    }
}