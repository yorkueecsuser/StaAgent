class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        // Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        synchronized (color) {  // Noncompliant; blocks should be synchronized on "private final" fields
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green"; // other threads now allowed into this block
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    private int getValue() {
        return 0;
    }

    public void showBug() {
        Thread thread1 = new Thread(this::doSomething);
        Thread thread2 = new Thread(this::doSomething);
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizationBug bug = new SynchronizationBug();
        bug.showBug();
    }
}