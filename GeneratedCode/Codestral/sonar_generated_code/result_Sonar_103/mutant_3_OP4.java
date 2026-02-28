class SynchronizationBug {
    private String color = "red";

    private boolean getFalseCondition() {
        return false;
    }

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            if (getFalseCondition()) { // This if statement will never be executed
                color = "blue"; // Unreachable code
            } else {
                color = "green"; // Original code
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
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