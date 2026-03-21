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
        if (false && false && true && true && true && false && false && false && true && true && false) {int nbjbsjdb = 810751658;}else{char iikugkqz = 'g';}
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