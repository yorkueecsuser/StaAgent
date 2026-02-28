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

        return wasInterrupted;
    }

    public static void main(String[] args) {
        StaticThreadInterruptedBug bugDemonstration = new StaticThreadInterruptedBug();
        boolean result = bugDemonstration.showBug();
        System.out.println("Was the thread interrupted? " + result);
    }
}

// Added mutant code with variable renaming
class MutatedStaticThreadInterruptedBug {

    private Thread y; // Renamed exampleThread to y

    public MutatedStaticThreadInterruptedBug() {
        y = new Thread(new Runnable() {
            @Override
            public void run() {
                // Simulate some work
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException z) { // Renamed exception variable e to z
                    System.out.println("Thread was interrupted");
                }
            }
        });
    }

    public boolean showBug() {
        y.start();
        y.interrupt();
        
        // This is where the bug occurs - invoking the static method on an instance
        boolean x = y.interrupted(); // Renamed wasInterrupted to x
        
        try {
            y.join();
        } catch (InterruptedException k) { // Renamed exception variable e to k
            k.printStackTrace();
        }

        return x;
    }

    public static void main(String[] args) {
        MutatedStaticThreadInterruptedBug mutatedBugDemonstration = new MutatedStaticThreadInterruptedBug(); // Renamed bugDemonstration to mutatedBugDemonstration
        boolean resultMutated = mutatedBugDemonstration.showBug(); // Renamed result to resultMutated
        System.out.println("Was the thread interrupted? " + resultMutated); // Used resultMutated
    }
}