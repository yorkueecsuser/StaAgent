class SynchronizationBug {
    private String color = "red";
    private String newColor = "blue"; // Mutant: Renaming user-defined variable

    public void doSomething() {
        synchronized (color) {
            System.out.println("Thread " + Thread.currentThread().getId() + " started");
            newColor = "green"; // Mutant: Using the new variable name
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