class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            boolean unreachableCondition = getCondition();
            if (unreachableCondition) {
                // Unreachable code
                System.out.println("This line should never be executed");
            } else {
                // Code that will always be executed
                color = "green";
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    private boolean getCondition() {
        // Replace this with a real condition that always returns false in this context
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