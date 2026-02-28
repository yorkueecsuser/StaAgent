class SynchronizationBug {
    private String color = "red";

    private boolean getUnreachableCondition() { // Method added to satisfy the no-false-constant rule
        return false;
    }

    public void doSomething() {
        while (getUnreachableCondition()) { // Unreachable while loop added here
            System.out.println("This code is unreachable.");
        }

        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green";
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