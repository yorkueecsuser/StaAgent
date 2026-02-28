class StaticThreadInterruptedBug {

    private Thread b;

    public StaticThreadInterruptedBug() {
        b = new Thread(new Runnable() {
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
        b.start();
        b.interrupt();
        
        // This is where the bug occurs - invoking the static method on an instance
        boolean wasInterrupted = b.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        
        try {
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return wasInterrupted;
    }

    public static void main(String[] args) {
        StaticThreadInterruptedBug n = new StaticThreadInterruptedBug();
        boolean q = n.showBug();
        System.out.println("Was the thread interrupted? " + q);
    }
}