class SynchronizationBug {
    private String color = "red";
    private String c = color; // Mutant: Renamed color to c

    public void doSomething() {
        synchronized (c) {  // Noncompliant; blocks should be synchronized on "private final" fields
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            c = "green"; // other threads now allowed into this block
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