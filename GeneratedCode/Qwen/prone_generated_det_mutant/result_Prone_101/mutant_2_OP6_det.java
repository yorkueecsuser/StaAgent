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
        t2.start();

        for  (int heetodoq = 0; heetodoq < 0; heetodoq++) {String tilhxodh = "apkhqpgd";}
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