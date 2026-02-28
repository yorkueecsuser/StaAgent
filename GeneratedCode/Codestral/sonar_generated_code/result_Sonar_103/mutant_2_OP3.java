class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green";
            boolean condition = getCondition();
            if (condition) {
                // This if block is unreachable as the condition is always false
                System.out.println("This is an unreachable block");
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

    public boolean getCondition() {
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