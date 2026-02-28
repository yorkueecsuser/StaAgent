class ThreadBug {
    private final Object l = new Object();

    public void showBug() throws InterruptedException {
        synchronized (l) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();

        Thread t1 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}