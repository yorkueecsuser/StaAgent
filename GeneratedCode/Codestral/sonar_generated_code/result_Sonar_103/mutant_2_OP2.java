class SynchronizationBug {
    private String color = "red";
    private String colorDuplicate = "red";

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            color = "green"; // original assignment
            colorDuplicate = color; // new mutant assignment
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