class MyClass {
    public void doSomethingSynchronized() {
        synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
            System.out.println("Doing something in a synchronized block.");
        }
    }

    // Demonstrates the bug
    public void showBug() {
        // Create multiple threads to simulate potential synchronization issues
        Thread t1 = new Thread(() -> doSomethingSynchronized());
        Thread t2 = new Thread(() -> doSomethingSynchronized());

        // Start the threads
        t1.start();
        t2.start();

        // Join threads to ensure they finish before method exit
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MyClass instance = new MyClass();
        instance.showBug();
    }
}