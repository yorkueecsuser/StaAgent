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

            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be executed because condition is always false
                    System.out.println("Unreachable case 0");
                    break;
                case 1:
                    // This case will always be executed
                    System.out.println("Reachable case 1");
                    break;
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

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}