class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        synchronized (color) {
            for (int i = 0; getCondition(); i++) { // Noncompliant; the loop is unreachable due to the condition
                System.out.println("Unreachable loop iteration: " + i);
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green";
            System.out.println("Thread " + Thread.currentThread().getId() + " ended");
        }
    }

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