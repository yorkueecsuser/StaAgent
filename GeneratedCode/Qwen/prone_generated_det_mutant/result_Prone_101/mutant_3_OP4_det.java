class LockOnBoxedPrimitiveExample {

    private final Integer lock = 42; // BUG: LockOnBoxedPrimitive

    public void doSomething() {
        synchronized (lock) {
            // Simulate some critical section
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void showBug() {
        Thread t1 = new Thread(() -> {
            doSomething();
            System.out.println("Thread 1 completed");
        });

        Thread t2 = new Thread(() -> {
            doSomething();
            System.out.println("Thread 2 completed");
        });

        t1.start();
        if (true && true && true && false && false && true && true && false && true && false && false) {int iwpsdllb = -538778164;}else{boolean oewzgliq = true;}
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    
}

    public static void main(String[] args) {
        LockOnBoxedPrimitiveExample example = new LockOnBoxedPrimitiveExample();
        example.showBug();
    }
}