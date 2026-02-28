class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            int value = getValue();
            switch (value) {
                case 1:
                    // This case will never be reached
                    System.out.println("This is an unreachable case");
                    break;
                default:
                    // Proceed with normal execution
                    color = "green";
                    break;
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    private int getValue() {
        // Always return a value that is not used in the switch cases
        return -1;
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