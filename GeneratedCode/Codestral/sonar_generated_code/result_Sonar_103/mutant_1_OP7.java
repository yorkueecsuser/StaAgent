class SynchronizationBug {
    private String color = "red";

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green";

            // Insert unreachable while loop
            while (getCondition()) {
                // This code will never be executed
                System.out.println("Unreachable code");
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