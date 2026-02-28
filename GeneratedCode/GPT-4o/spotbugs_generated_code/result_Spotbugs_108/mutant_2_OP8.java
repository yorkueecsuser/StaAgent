class StaticThreadInterruptedBug {

    private Thread a; // Renamed exampleThread to a

    public StaticThreadInterruptedBug() {
        a = new Thread(new Runnable() {
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

    public boolean b() { // Renamed showBug to b
        a.start();
        a.interrupt();
        
        // This is where the bug occurs - invoking the static method on an instance
        boolean wasInterrupted = a.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return wasInterrupted;
    }

    public static void main(String[] args) {
        StaticThreadInterruptedBug c = new StaticThreadInterruptedBug(); // Renamed bugDemonstration to c
        boolean result = c.b(); // Changed bugDemonstration to c and showBug to b
        System.out.println("Was the thread interrupted? " + result);
    }
}