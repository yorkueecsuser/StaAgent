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
        
        // Insert unreachable if-else statement
        boolean condition = getRandomCondition(); // method to simulate a changeable condition
        if (condition) {
            System.out.println("Unreachable code block.");
        } else {
            System.out.println("This will always be executed.");
        }
        
        try {
            exampleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return wasInterrupted;
    }

    public static void main(String[] args) {
        StaticThreadInterruptedBug bugDemonstration = new StaticThreadInterruptedBug();
        boolean result = bugDemonstration.showBug();
        System.out.println("Was the thread interrupted? " + result);
    }

    // Helper method to simulate a runtime condition
    private boolean getRandomCondition() {
        return false; // condition that makes the branch unreachable
    }
}