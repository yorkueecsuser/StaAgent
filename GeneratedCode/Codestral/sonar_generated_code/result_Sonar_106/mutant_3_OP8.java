class ThreadBug {
    private final Object lockObj = new Object(); // Mutant: Renamed 'lockObject' to 'lockObj'

    public void showBug() throws InterruptedException {
        synchronized (lockObj) { // Updated to match the new variable name
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            lockObj.wait(1000); // Mutant: Used 'wait(...)' instead of 'Thread.sleep(...)' when a lock is held
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();

        Thread thr1 = new Thread(() -> { // Mutant: Renamed 'thread1' to 'thr1'
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thr2 = new Thread(() -> { // Mutant: Renamed 'thread2' to 'thr2'
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thr1.start(); // Updated to match the new variable name
        thr2.start(); // Updated to match the new variable name
    }
}