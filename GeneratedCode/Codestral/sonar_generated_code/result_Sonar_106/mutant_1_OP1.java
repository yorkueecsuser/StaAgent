class ThreadBug {
    private final Object lockObject = new Object();

    public void showBug() throws InterruptedException {
        int deadStore; // Added dead store variable
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            lockObject.wait(1000); // Corrected to use "wait(...)" instead of "Thread.sleep(...)"
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();

        Thread thread1 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}