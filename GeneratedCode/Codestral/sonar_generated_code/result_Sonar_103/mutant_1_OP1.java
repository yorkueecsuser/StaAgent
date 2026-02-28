class SynchronizationBug {
    private String color = "red";

    public void doSomething() {
        String deadStore = "abcdefgh"; // Dead store - this variable is never used

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