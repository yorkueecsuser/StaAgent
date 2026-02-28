class ThreadBug {
    private final Object lockObject = new Object();

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            boolean condition = getCondition();
            while (condition) { /* This loop is unreachable */ }
            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
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