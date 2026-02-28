class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        // Inserted unreachable if statement
        if (getCondition()) {
            // This block will never be executed
            System.out.println("Unreachable code");
        }

        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green";
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
        return false;
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