class ThreadBug {
    private final Object lockObject = new Object();

    private boolean alwaysFalse() {
        return false;
    }

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            if (alwaysFalse()) {
                // Unreachable if statement
                lockObject.wait();
            } else {
                Thread.sleep(1000);
            }
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